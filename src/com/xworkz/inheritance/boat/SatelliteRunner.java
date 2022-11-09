package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.Moon;
import com.xworkz.inheritance.things.Satellite;

public class SatelliteRunner {
	public static void main(String[] args) {
		Satellite sate = new Moon();
		sate.display();
		// if(Moon instanceof Satellite) {
		System.out.println(System.lineSeparator());
		Satellite moon = new Moon(5342, "Bright", "White");
		moon.display();
	}
}
