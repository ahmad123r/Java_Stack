package com.example.demo;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
public class DisplayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisplayApplication.class, args);
	}
	@RequestMapping("/")
	public String root() {
		return "root.jsp";
		
	}
	@RequestMapping("/date")
	public String date(Model model) {
		String datePattern = "EEEEE, 'the' dd 'of' MMMMM, yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
		String date = dateFormat.format(new Date());
	
	model.addAttribute("date", date);
		return "date.jsp";
		
	}
	@RequestMapping("/time")
	public String time(Model model) {
		String timePattern = "hh:mm a";
		SimpleDateFormat dateFormat = new SimpleDateFormat(timePattern);
		String now = dateFormat.format(new Date());
	

		   model.addAttribute("time", now);
		return "time.jsp";
		
	}

}
