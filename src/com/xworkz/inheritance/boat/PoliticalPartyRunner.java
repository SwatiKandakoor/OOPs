package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.BJP;
import com.xworkz.inheritance.things.PoliticalParty;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
		PoliticalParty party = new PoliticalParty("BJP", 200);
		party.display();
		
		System.out.println(System.lineSeparator());

		PoliticalParty party1 = new BJP("BJP", 200, "Bangalore");
		party1.display();
	}

}
