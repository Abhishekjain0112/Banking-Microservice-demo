package com.example.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class FoodEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodEurekaServerApplication.class, args);
	}

}
