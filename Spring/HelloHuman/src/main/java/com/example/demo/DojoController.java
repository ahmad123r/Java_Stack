package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{track}")
    public String xm(@PathVariable("track") String track){
    	return "The" + track+"is awesome!" ;
    }
	@RequestMapping("/m/{track}")
    public String xm1(@PathVariable("track") String track){
		String s= track.replace('-', ' ');
		String x=s.substring(0, 1).toUpperCase() + s.substring(1)+s.substring(0, 1).toUpperCase() ;
    	return x+" "+"is located in Southern California" ;
    }
	@RequestMapping("/m1/{track}")
	public String xm2(@PathVariable("track") String track){
		String s= track.replace('-', ' ');
		 String x = s;
		 String mmm = " ";
		    String[] myName = x.split(" ");
		    for (int i = 0; i < myName.length; i++) {
		        String k = myName[i];
		     mmm +=  k.toUpperCase().charAt(0);
		    }
		
    	return mmm+" "+"dojo is the headquarters" ;
    }
}
