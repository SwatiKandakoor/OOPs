package com.xworkz.inheritance.things;

public class Satellite {
	
	public int distance;
	public String brightness;
	
	public Satellite(int distance, String brightness) {
		super();
		this.distance = distance;
		this.brightness = brightness;
	}
	
	public void display() {
		System.out.println(distance);
		System.out.println(brightness);
	}

}
