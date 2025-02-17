package com.SPA.SPA_Project.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SPA.SPA_Project.DBUtils.DBConnection;
import com.SPA.SPA_Project.model.PurchaseEntry;
import com.SPA.SPA_Project.model.User;

@Controller
public class LoginController {

	 	@GetMapping("/login")
	    public String showLoginForm(Model model) {
	        model.addAttribute("user", new User());
	        return "login";
	    }

	    @PostMapping("/login")
	    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
	    	if ("admin".equals(username) && "password".equals(password)) {
	            return "redirect:/home";
	        }
	        model.addAttribute("error", "Invalid username or password");
	        return "login";
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
	    @GetMapping("/bill")
	    public String billingPage() {
	        return "bill";
	    }
	    @GetMapping("/purchase")
	    public String purchasePage(Model model) {
	    	model.addAttribute("purchase", new PurchaseEntry());
	        return "purchase";
	    }
	    
	    @PostMapping("/purchase")
	    public String processPurchase(@ModelAttribute PurchaseEntry purchase, Model model) throws SQLException {
	    	DBConnection.dbStartConnection();
	        return "purchase";
	    }
	    
}
