package com.xworkz.inheritance.things;


public class ShoppingMall {

	public String ownerName;
	public String location;

	public ShoppingMall() {
		super();

	}

	public ShoppingMall(String ownerName, String location) {

		this.ownerName = ownerName;
		this.location = location;
	}

	public void display() {
		System.out.println("Orion Mall owner name :" + ownerName);
		System.out.println("Mall location :" + location);
	}

}
