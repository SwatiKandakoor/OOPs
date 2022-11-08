package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.Event;
import com.xworkz.inheritance.things.Catering;

public class CateringRunner {

	public static void main(String[] args) {
		Catering ref = new Event("Marrige", "Banglore", 20);
		System.out.println(ref.typeOfEvent);
		System.out.println(ref.location);
		System.out.println(ref.teamMembers);

	}

}
