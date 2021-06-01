package com.spring.banking.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

	private String number;
	private String type;
	private long balance;
	
}
