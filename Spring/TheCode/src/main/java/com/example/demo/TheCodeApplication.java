package com.example.demo;
import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@SpringBootApplication
@Controller
public class TheCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheCodeApplication.class, args);
	}
	@RequestMapping("/")
	public String x() {
	
			return "main.jsp";}
	@RequestMapping(value="/mm", method=RequestMethod.POST)
	public String xx(@RequestParam(value="se") String k) {
		if(k.equals("bushido")) {
			return "redirect:/code";
		}
		else {
			System.out.println(k+"???????????????????????????????????????");
			return "redirect:/createError";}
		
			
	}
	
	@RequestMapping("/code")
	public String x1() {
		
			return "sec.jsp";
		
	}
	 @RequestMapping("/createError")
	    public String flashMessages(RedirectAttributes redirectAttributes) {
	        redirectAttributes.addFlashAttribute("error", " Train Hard");
	        return "redirect:/";
	    }

	
}
