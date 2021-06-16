package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloHuman1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloHuman1Application.class, args);
	}
	@RequestMapping("/")
    public String index(@RequestParam(value="q", required=false) String searchQuery) {
		if(searchQuery != null)
			return "Hello " + searchQuery+"!";
		else {
			
		searchQuery="Human";
		
		
		return "Hello " + searchQuery+"!";
		}
    }
}
