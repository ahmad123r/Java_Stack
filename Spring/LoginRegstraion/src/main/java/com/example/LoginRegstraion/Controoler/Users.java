package com.example.LoginRegstraion.Controoler;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.LoginRegstraion.Services.UserService;
import com.example.LoginRegstraion.models.User;
import com.example.LoginRegstraion.validation.UserValidator;

@Controller
public class Users {
    private final UserService userService;
    private final UserValidator userValidator;
    
    public Users(UserService userService,UserValidator userValidator) {
        this.userService = userService;
        this.userValidator= userValidator;
    }
    @RequestMapping("/")
    public String x1() {
    	return "redirect:/registration";
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session,Model model) {
        userValidator.validate(user, result);

    	if(result.hasErrors())
    		return "registrationPage.jsp";
    	if(userService.findByEmail(user.getEmail()) != null) {
    		model.addAttribute("error", "This email is already exists");
    	}
    		userService.registerUser(user);
    	session.setAttribute("userId", user.getId());
		return "redirect:/home";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
    	if(userService.authenticateUser(email, password)) {
    		session.setAttribute("user_email", userService.findByEmail(email).getId());
    		return "redirect:/home";
    	}
    	else {
    	model.addAttribute("error", "Invaild pasword and name");
    	return "loginPage.jsp";
    	}
    	
    	
		
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
    	
    	
    	model.addAttribute("userId", session.getAttribute("userId"));
    	return "homePage.jsp";
        // get user from session, save them in the model and return the home page
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
		return "redirect:/login";
        // invalidate session
        // redirect to login page
    }
}