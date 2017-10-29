package com.spring.setter;

public class Person {
	
	private int id;
	private String name;
	
	private int taxId;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public void speak() {
		System.out.println("Hello! I'm a person.");
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + "]";
	}
	
}
