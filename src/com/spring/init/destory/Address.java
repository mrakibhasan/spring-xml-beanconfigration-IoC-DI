package com.spring.init.destory;

public class Address {
	private String street;
	private String postcode;
	
	public Address(String street, String postcode) {
		this.street = street;
		this.postcode = postcode;
	}

	public void init() {
		System.out.println("Address Bean created with init method: " + this);
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}
}
