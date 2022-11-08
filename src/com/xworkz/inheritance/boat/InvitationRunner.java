package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.HomeCeremony;
import com.xworkz.inheritance.things.Invitation;

public class InvitationRunner {
	public static void main(String[] args) {
		Invitation invitation = new HomeCeremony("HomeCeremony Card", "Bule", 10);
		System.out.println(invitation.cardType);
		System.out.println(invitation.color);
		System.out.println(invitation.size);

	}
}
