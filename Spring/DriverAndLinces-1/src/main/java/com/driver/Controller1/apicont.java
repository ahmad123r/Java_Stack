package com.driver.Controller1;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.driver.Services.DServics;
import com.driver.models.Lin;
import com.driver.models.Person;


@Controller
public class apicont {
	private final DServics services;

	public apicont(DServics services) {
		
		this.services = services;
	}
	
	@RequestMapping("/")
	public String x1(@ModelAttribute("per") Person person1) {
		return "index.jsp";
	}
	@RequestMapping("/lin")
	public String x2(@ModelAttribute("lin") Lin lin1 ,Model model) {
		model.addAttribute("att", services.findAll());
		
		return "lin.jsp";
	}
	@RequestMapping(value="/new", method =RequestMethod.POST)
	public String createlin (@Valid@ModelAttribute("lin") Lin lin1, BindingResult result) {
		
		if(result.hasErrors() ) {
			return "lin.jsp";
		}
		services.createLin(lin1);
		return "redirect:/lin";
	}
	
	@RequestMapping(value="/students/new", method =RequestMethod.POST)
	public String createStudent (@Valid@ModelAttribute("per") Person person1, BindingResult result) {
		
		if(result.hasErrors() ) {
			return "index.jsp";
		}
		services.createP(person1);
		return "redirect:/";
	}
	@RequestMapping("/{id}")
	public String ShowPerson(@PathVariable("id") Long id, Model model) {
//		Book book = bookService.findBook(id);
		model.addAttribute("att", services.findBook(id));
		return "show.jsp";
	}
	

}





