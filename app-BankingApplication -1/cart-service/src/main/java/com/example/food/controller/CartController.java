package com.example.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.food.model.CartDetails;
import com.example.food.service.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartService service;

	@GetMapping("/item/{menuItemId}/coupon/{couponCode}")
	public CartDetails getCartDetails(@PathVariable long menuItemId, @PathVariable String couponCode) {
		return service.getCartDetails(menuItemId, couponCode);
	}
	
	
}
