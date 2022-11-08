package com.xworkz.inheritance.things;

public class Marriage {
	public String name;
	public String location;
	public double totalPrice;
	
	public Marriage() {
		super();
		System.out.println("default constructor of Marriage");
		
	}
	
	public Marriage(String name, String location, double totalPrice) {
		super();
		this.name = name;
		this.location = location;
		this.totalPrice = totalPrice;
	}
		

}
