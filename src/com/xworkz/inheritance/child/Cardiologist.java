package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Doctor;

public class Cardiologist extends Doctor {
	public String name;
	public double consultationFees;
	
	public Cardiologist() {
		System.out.println("default constructor of Cardiologist ");
	}
}
