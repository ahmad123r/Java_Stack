package com.sys.axsos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sys.axsos.models.LangMod;
import com.sys.axsos.services.ServicingLanguages;



@Controller
public class LangControl {
 private final ServicingLanguages langRep;
 
 public LangControl(ServicingLanguages langRep) {
     this.langRep = langRep;
     }
 
 @RequestMapping("/langs")
 public String index(Model model,@ModelAttribute("lang") LangMod newLanguage) {
     List<LangMod> langs = langRep.langs();
     model.addAttribute("langs", langs);
//     model.addAttribute("lang", new LangMod()); 
     return "index.jsp";
}
 @RequestMapping(value="/langs", method=RequestMethod.POST)
 public String create(@Valid @ModelAttribute("lang") LangMod newLanguage, BindingResult result) {
	 if (result.hasErrors()) {
		 return "index.jsp";
	 } else {
		 langRep.createLang(newLanguage);
		 return "redirect:/langs";
	 }
 }
 @RequestMapping("/langs/delete/{id}")
 public String destroy(@PathVariable("id") Long id) {
	 langRep.deleteLang(id);
	 return "redirect:/langs";
 }
 
 @RequestMapping("/langs/edit/{id}")
 public String edit(@PathVariable("id") Long id, Model model) {
	 LangMod lang = langRep.findLang(id);
     model.addAttribute("lang", lang);
     return "edit.jsp";
 }
 @RequestMapping(value="/langs/{id}", method=RequestMethod.PUT)
 public String update(@Valid @ModelAttribute("lang") LangMod lang, BindingResult result) {
     if (result.hasErrors()) {
         return "edit.jsp";
     } else {
    	 langRep.updateLang(lang);
         return "redirect:/langs";
     }
 }

// @RequestMapping("/books/{id}")
// public String showhh(Model model,@PathVariable("id") Long id) {
//	 UpdateHere book = bookService.findBook(id);
//	 model.addAttribute("book", book);
//	 return "/books/show.jsp";
// }
// 
// @RequestMapping("/books/new")
// public String newBook(@ModelAttribute("book") UpdateHere book) {
//     return "/books/new.jsp";
// }
// 
 
}