package com.example.last.contrller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.last.Services.ApiServices;
import com.example.last.models.Category;
import com.example.last.models.Product;



@Controller
public class ProductController {
	private final ApiServices api;
	
	
	
	public ProductController(ApiServices api) {
		
		this.api = api;
	}

	@RequestMapping("/")
	public String index(@ModelAttribute("products") Product p) {
		
		return "index.jsp";
	}
	
	@RequestMapping("/createP")
	public String createP(@ModelAttribute("products") Product p,BindingResult result) {
		
		if(result.hasErrors()) {
			
			return "index.jsp";
		}
		else {
			api.createproduct(p);
			return "redirect:/";
		}
		
		
	}
	
	@RequestMapping("/cat")
	public String index(@ModelAttribute("cate") Category cate) {
		
		
		return "newcat.jsp";
	}
	
	@RequestMapping("/createC")
	public String createCat(@ModelAttribute("cate") Category cate,BindingResult result) {
		
		if(result.hasErrors()) {
			return "newcat.jsp";
		}
		else {
			api.createcategory(cate);
			return "redirect:/cat";
		}

	}

	@RequestMapping("/products/{id}")
	public String newContact (@PathVariable("id") long id,@ModelAttribute("cate") Category cate, Model model) {
		Product x = api.getPro(id).orElse(null);
		model.addAttribute("products", x);
		model.addAttribute("cat", api.allCat());
		model.addAttribute("categories",api.allNullCat());

		return "pro.jsp";
	}
	
//	@RequestMapping("/cat/{id}")
//	public String newContactx (@PathVariable("id") long id,@ModelAttribute("category") Category category, Model model) {
//		Product x = api.getPro(id).orElse(null);
//		model.addAttribute("products", x);
//		model.addAttribute("cat", api.allNullCategory());
//
//		return "pro.jsp";
//	}
	
	
	}
	

