package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController

public class FirstProjectStringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectStringApplication.class, args);
		
	}
	@RequestMapping("/")
    // 3. Method that maps to the request route above
    public String hello() { // 3
		String s ="Hello clint! How are you doing!";
      return s;
    }
	@RequestMapping("/random")
	 public String hello1() { // 3
			String s ="Spring Boot is great! so easy to responsed with string";
	      return s;
	    }

}
