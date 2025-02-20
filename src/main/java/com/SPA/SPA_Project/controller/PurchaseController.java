package com.SPA.SPA_Project.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SPA.SPA_Project.model.PurchaseEntry;

@RestController
@RequestMapping("/purchase")
@CrossOrigin(origins = "http://localhost:8080")
public class PurchaseController {

	
	
    
    @PostMapping
    public ResponseEntity<String> processPurchase(@RequestBody List<PurchaseEntry> purchaseEntryList) throws SQLException {
    
    	for(PurchaseEntry purchaseEntry:purchaseEntryList) {
    		System.out.println(purchaseEntry.getBrandName());
    	}
        return new ResponseEntity<String>("Data Loaded Successfully", null, HttpStatus.OK);
    }
}
