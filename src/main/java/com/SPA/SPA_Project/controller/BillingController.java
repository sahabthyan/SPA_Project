package com.SPA.SPA_Project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BillingController {

	
	@GetMapping("/bill")
    public String billingPage() {
    return "bill";
    }
	
}
