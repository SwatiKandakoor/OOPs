package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Director;

public class Prasanth extends Director {

	public int directorHeight;

	public Prasanth(String movieName, String directorName, int directorHeight) {
		super(movieName, directorName);
		this.directorHeight = directorHeight;
	}

	public void display() {
		super.display();
		System.out.println("Director Height :" + directorHeight);
	}
}
