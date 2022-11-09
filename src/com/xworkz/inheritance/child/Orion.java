package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.ShoppingMall;

public class Orion extends ShoppingMall{
	
	public int area;

	public Orion(String ownerName, String location) {
		super(ownerName, location);
	}

	public Orion(String ownerName, String location, int area) {
		this(ownerName, location);
		this.area = area;
	}

	public void display() {
		super.display();
		System.out.println("Orion mall area :" + area);
	}

}
