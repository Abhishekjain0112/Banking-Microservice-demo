package com.spring.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BankingLoanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingLoanApplication.class, args);
	}

}
