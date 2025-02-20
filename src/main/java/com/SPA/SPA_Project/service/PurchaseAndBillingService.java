package com.SPA.SPA_Project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SPA.SPA_Project.repository.PurchaseEntryRepository;

@Service
public class PurchaseAndBillingService {

	@Autowired
	PurchaseEntryRepository purchaseAndBillingRepository;
	
	
}
