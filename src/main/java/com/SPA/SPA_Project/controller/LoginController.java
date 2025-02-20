package com.SPA.SPA_Project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SPA.SPA_Project.model.PurchaseEntry;
import com.SPA.SPA_Project.model.User;
import com.SPA.SPA_Project.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	 	@GetMapping("/login")
	    public String showLoginForm(Model model) {
	        model.addAttribute("user", new User());
	        return "login";
	    }

	    @PostMapping("/login")
	    public String processLogin(@RequestParam String userName, @RequestParam String password, Model model) {	
	    if ((userName != null || !userName.isEmpty()) && (password != null || !password.isEmpty())) {
	    		
	    		if(loginService.userLogin(userName,password)) {
	    			return "redirect:/home";
	    		}else {
	    			 model.addAttribute("error", "Invalid username or password");
	    		     return "login";
	    		}
	    	}
	        model.addAttribute("error", "Invalid username or password");
	        return "login";
	    }
	    
	    @GetMapping("/purchase")
	    public String purchasePage(Model model) {
	    	model.addAttribute("purchase", new PurchaseEntry());
	        return "purchase";
	    }
	    
//	    @PostMapping("/home")
//	    public String processHome(@RequestParam String name) {
//	    	
//	    	System.out.println(name);
//	        return "login";
//	    }
	    
	    @GetMapping("/home")
	    public String homePage() {
	        return "home";
	    }
	    @GetMapping("/welcome")
	    public String welcomePage() {
	        return "welcome";
	    }
}
