package com.spring.collection;

import java.util.List;

public class FruitBasket {
	private String name;
	private List<String> fruits;
	public FruitBasket(){
		
	}
	
	public FruitBasket(String name, List<String> fruits) {
		this.name = name;
		this.fruits = fruits;
	}
	
	public void display(){
		System.out.println(name +" contains: ");
		for(String fruit:fruits){
			System.out.println(fruit);
		}
	}
}
