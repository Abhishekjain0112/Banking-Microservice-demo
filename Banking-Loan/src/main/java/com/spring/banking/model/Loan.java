package com.spring.banking.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Loan {

	
	private String number;
	private String car;
	private long loan;
	private long emi;
	private int tenure;
	
}
