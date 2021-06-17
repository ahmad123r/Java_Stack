package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@SpringBootApplication
public class SurvyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurvyApplication.class, args);
	}
	@RequestMapping("/")
	public String x1() {
		return "index.jsp";
		
	}
	@RequestMapping("/rew")
	public String x3() {
		return "result.jsp";
	}
	@RequestMapping("/res")
	public String x2(HttpSession session ,@RequestParam (value="name") String name,@RequestParam (value="location") String loc,@RequestParam (value="language") String language,@RequestParam (value="comment") String comment){
		session.setAttribute("name", name);
		session.setAttribute("location", loc);
		session.setAttribute("language", language);
		session.setAttribute("comment", comment);
		return "redirect:/rew";
	}

}
