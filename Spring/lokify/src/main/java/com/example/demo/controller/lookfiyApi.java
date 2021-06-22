package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.models;
import com.example.demo.servies.services;


@Controller

public class lookfiyApi {
	private final services ser;
	public lookfiyApi(services ser) {
		this.ser=ser;
		
	}
	 @RequestMapping("/")
	 public String index(Model model,@ModelAttribute("songs") models newLanguage) {
	     List<models> songs = ser.song();
	     model.addAttribute("songs", songs);
//	     model.addAttribute("lang", new LangMod()); 
	     return "home.jsp";
	}
	 @RequestMapping("/songs")
	 public String rend(Model model,@ModelAttribute("songs") models newLanguage) {
		 List<models> songs = ser.song();
	     model.addAttribute("songs", songs);
		
	     return "create.jsp";
	 }
	 @RequestMapping("/songs111")
	 public String x1(HttpSession session,Model model,@ModelAttribute("songs") models newLanguage) {
	     List<models> songs = ser.song();
//	     session.setAttribute("songs", songs);
	     model.addAttribute("songs", songs);
		 return "dash.jsp";
	 }
	 @RequestMapping(value="/songs1", method=RequestMethod.POST)
	 public String create123(@RequestParam(value="name") String name, @RequestParam(value="rating") int rating,@RequestParam(value="title") String title) {
		 System.out.println("Baaaaaaaad request");
	     models book = new models( name,rating,title);
	      ser.createsong(book);
	      return "redirect:/songs111";
	 }
	 
	 @RequestMapping("/delete/{id}")
	 public String destroy(@PathVariable("id") Long id) {
		 ser.deleteLang(id);
		 return "redirect:/songs111";
	 }
	 
//	 findById
	 @RequestMapping("/song/{id}")
	 public String findById(@PathVariable("id") Long id,Model model,@ModelAttribute("songs") models newLanguage) {
		 models songs = ser.findById(id).orElse(null);
		 model.addAttribute("songs",songs);
//	     session.setAttribute("songs", songs);
//	     model.addAttribute("songs",ser.findById(id));
	return "user.jsp";
		 
	 }
	 @RequestMapping("/search/{name}")
	 public String findByName(@PathVariable("name") String name,Model model,@ModelAttribute("songs") models newLanguage) {
		 models songs =  ser.findByName(name);
		 model.addAttribute("songs",songs);
		
		 System.out.println("dgdfgdfsgsdfgdf");
//	     session.setAttribute("songs", songs);
//	     model.addAttribute("songs",ser.findById(id));
	return "user1.jsp";
		 
	 }
	
	 @RequestMapping(value="/search", method=RequestMethod.POST)
     public String login(@RequestParam(value="name") String name,Model model) {
		 models songs =  ser.findByName(name);
		 model.addAttribute("songs",songs);
		
	return "user1.jsp";
     }
	 
	 @RequestMapping("/songs/topTen")
		public String TopTen(Model model) {
			model.addAttribute("songs", ser.topTenByRating());
			return "topTen.jsp";
		}
	 
	 }


