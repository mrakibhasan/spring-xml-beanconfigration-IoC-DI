package com.spring.propskey;

import java.util.HashMap;
import java.util.Map;

public class Jungle {
	
	private Map<String, String> foods = new HashMap<String, String>();
	private Map<String, Animal> animals = new HashMap<String, Animal>();
	
	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	public void setAnimals(Map<String, Animal> animals) {
		this.animals = animals;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String> entry: foods.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		System.out.println();
		for(Map.Entry<String, Animal> an: animals.entrySet()) {
			sb.append(an.getKey() + ": " + an.getValue() + "\n");
		}
		
		return sb.toString();
	}
	
}