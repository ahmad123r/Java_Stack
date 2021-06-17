package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class loginRegstration {
	@RequestMapping("/")
	public String strat() {
		return "login.jsp";
	}
	@RequestMapping("/welcome")
	public String strat1(HttpSession session) {
		if(session.getAttribute("email") != null) {
			
			
			return "welcome.jsp";
		}
		return "redirect:/";
	}


	@RequestMapping(value="/login",method =RequestMethod.POST)
	public String login(HttpSession session ,@RequestParam (value="email") String email,@RequestParam (value="password") String password) {
		if(email.equals("ahmad@hotmail.com") && password.equals("ahmad")) {
			if(session.getAttribute("email") == null) {
				session.setAttribute("email", email);
				
				
			}
			return "redirect:/welcome";
		}
		
		 return "redirect:/";
		
		
	}
	@RequestMapping( "/logout")
	public String logout(HttpSession session) {
	    
	    if (session.getAttribute("email") != null) 
	        	session.invalidate();
	        return "redirect:/";
	    
	    
	}
	

}
