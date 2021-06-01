package com.spring.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.banking.model.Account;

@RestController
@RequestMapping("/account-service")
public class AccountController {

	
	@GetMapping("/accounts/{number}")
	public Account getAccount(@PathVariable String number) {		
		return new Account(number, "Saving", 234343);
	}
	
	@GetMapping("/accounts/hello")
	public String getHello() {		
		return "Hello Abhishek";
	}

	
	
	
}
