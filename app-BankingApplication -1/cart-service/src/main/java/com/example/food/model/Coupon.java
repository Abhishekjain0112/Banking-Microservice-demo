package com.example.food.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {


	private long id;
	
	private String couponCode;
	private double discount;
	private double maxDiscount;
	private int port;
	
	
}