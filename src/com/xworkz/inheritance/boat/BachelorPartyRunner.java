package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.WomenBachelorParty;
import com.xworkz.inheritance.things.BachelorParty;

public class BachelorPartyRunner {
	public static void main(String[] args) {

		BachelorParty party = new WomenBachelorParty("Ilkal", 20, 15000);
		System.out.println(party.location);
		System.out.println(party.partyMembers);
		System.out.println(party.totalPartyAmount);

	}

}
