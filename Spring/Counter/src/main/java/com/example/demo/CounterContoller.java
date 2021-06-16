package com.example.demo;
import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class CounterContoller {
	static int i=1;
	@RequestMapping("/")
	public String c1(HttpSession session) {
		
		if(session.getAttribute("count")==null) {
		
		session.setAttribute("count", i);}
		else {
			session.setAttribute("count", i++);
		}
		
		
		
        return "home.jsp";
	
	}
	@RequestMapping("/counter")
	public String c2(HttpSession session ,Model model) {

		
        
        
       
        return "count.jsp";
	
	}
	

}
