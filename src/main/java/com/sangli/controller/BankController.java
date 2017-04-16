package com.sangli.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

	@GetMapping("/getdata")
	public String getData(
			@RequestParam(name = "accountnumber", required = true) String accountnumber){
		System.out.println("AccountNumber is: "+ accountnumber);
		String customerString = "{\"customerName\":\"Omkar\",\"customerAccno\":\"ABC1234\", \"customerDOB\":\"14-09-1984\", \"customerAddress\": \"Pune\", \"customerPAN\": \"PAN123\", \"customerAdhar\": \"Adhar123\", \"money\": \"500\"}";
		return customerString;
		
		

		
		
	}
}
