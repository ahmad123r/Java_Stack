package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

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
public class NinjaGoldApplication {

	public static void main(String[] args) {
		SpringApplication.run(NinjaGoldApplication.class, args);
	}
	@RequestMapping("/")
	public String x1() {
		return "index.jsp";
	}
	int gold=0;
	int xm=0;
	
	ArrayList<String> xr=new ArrayList();
	@RequestMapping("/xo")
	public String x2(@RequestParam(value="which_form") String which_form , HttpSession session) {
		String timeStamp = new SimpleDateFormat("MMMMM dd yyyy HH:mm a").format(new Date());
		String ks=" ";
		if(session.getAttribute("gold")==null) {
			session.setAttribute("gold", 0);
			
		}
		if (which_form.equals("farm")) {
            xm=(int) getRandomGold(20,10);
            gold+=xm;
            session.setAttribute("gold", gold);
            ks="You entered a farm and earned "+xm+" gold. ("+timeStamp+")\n";
            xr.add(ks);
			 session.setAttribute("act",xr);

        }
		if (which_form.equals("cave")) {
			xm=(int) getRandomGold(10,5);
            gold+=xm;
            session.setAttribute("gold", gold);
            ks="You entered a cave and earned "+xm+" gold. ("+timeStamp+")\n";
            xr.add(ks);
			 session.setAttribute("act",xr);

        }
		if (which_form.equals("house")) {
			xm=(int) getRandomGold(5,2);
            gold+=xm;
            session.setAttribute("gold", gold);
            ks="You entered a house and earned "+xm+" gold. ("+timeStamp+")\n";
            xr.add(ks);
			 session.setAttribute("act",xr);

        }
		if (which_form.equals("casino")) {
			xm=(int) getRandomGold(50,-50);
			if(xm>0) {
            gold+=xm;
            session.setAttribute("gold", gold);
            ks="You entered a casino and earned "+xm+" gold. ("+timeStamp+")\n";
            xr.add(ks);
			 session.setAttribute("act",xr);
			 session.setAttribute("arr", xm);}
			else {
				gold+=xm;
	            session.setAttribute("gold", gold);
	            ks="Ouch....... entered a casino and earned "+xm+" gold. ("+timeStamp+")\n";
	            xr.add(ks);
				 session.setAttribute("act",xr);
				 session.setAttribute("arr", xm);
				
			}

        }
		
		return "redirect:/";
	}
	
	public int getRandomGold(int max, int min) {
        Random rand = new Random();
        int value = rand.nextInt((max-min)+1)+min;
        return value;
    }
}
