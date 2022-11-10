package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Home;

public class Pg extends Home {

	@Override
	public void display() {
		super.display();
		System.out.println("pg is a home");
	}
}
