package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Satellite;

public class Moon extends Satellite {

	public String color;

	public Moon() {
		super(2456, "Light");
	}

	public Moon(int distance, String brightness, String color) {
		super(distance, brightness);
		this.color = "red";

	}

	public void display() {
		super.display();
		System.out.println(color);
	}

}
