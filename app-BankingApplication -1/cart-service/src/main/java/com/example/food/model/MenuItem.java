package com.example.food.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {

	
	private long id;
	private long menuItemId;
	private String itemName;
	private double price;
	private int port;
	
	
}