package com.spring.factorymethod;

public class Person {
	
	private int id;
	private String name;
	private int taxId;
	private Address address;
	
	public Person() {
		
	}
	//Factory methods are static methods that return an instance of the native class.
	/*public static Person getInstance(int id, String name) {
		System.out.println("Creating Person using factory method.");
		return new Person(id, name);
	}*/
	
	// if we use this method without any parameter we donot need use constructor value set in beans.xml because this called the constructor using here.
	// but if we 1st getInstance then we need to set constructor value in the beans.xml.
	public static Person getInstance() {
		System.out.println("Creating Person using factory method.");
		return new Person(123, "rakib");
	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
}
