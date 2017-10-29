package com.spring.reference.bean;

import java.util.List;

public class Jungle {
	private Animal largest;
	private List<Animal> animals;

	public Animal getLargest() {
		return largest;
	}

	public void setLargest(Animal largest) {
		this.largest = largest;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public void show (){
		System.out.println("Largest: "+largest);
		System.out.println("Others: ");
		for(Animal animal: animals) {
			System.out.println(animal);
		}
	}
}
