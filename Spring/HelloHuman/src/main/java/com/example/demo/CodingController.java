package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coding")
public class CodingController {
	@RequestMapping("")
    
    public String xx() { // 3
		String s ="Hello Coding Dojo!";
      return s;
    }
@RequestMapping("/python")
    
    public String xx1() { // 3
		String s ="Python/Django was awesome!";
      return s;
    }

@RequestMapping("/java")

public String xx2() { // 3
	String s ="Java/Spring was awesome!";
  return s;
}

}
