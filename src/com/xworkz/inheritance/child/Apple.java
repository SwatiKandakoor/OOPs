package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Fruit;

public class Apple extends Fruit {

	public String color;

	public Apple() {
		super(100, "Apple");
	}

	public Apple(double price, String fruitName, String color) {
		super(price, fruitName);
		this.color = "red";
	}

	public void display() {
		System.out.println(price);
		System.out.println(fruitName);
		System.out.println(color);
	}

}
