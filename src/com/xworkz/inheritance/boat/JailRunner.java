package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.CentralJail;
import com.xworkz.inheritance.child.SpecialJail;
import com.xworkz.inheritance.child.WomenJail;
import com.xworkz.inheritance.things.Jail;

public class JailRunner {
	public static void main(String[] args) {
		CentralJail central = new CentralJail();
		System.out.println(central.name);
		System.out.println(central.location);
		System.out.println(central.area);
		System.out.println(central.Address);
		System.out.println(System.lineSeparator());

		Jail jail = new CentralJail();
		System.out.println(jail.name);
		System.out.println(jail.location);
		CentralJail jail1 = (CentralJail) jail;
		System.out.println(jail1.area);
		System.out.println(jail1.Address);
		System.out.println(System.lineSeparator());

		Jail jail2 = new SpecialJail();
		System.out.println(jail2.name);
		System.out.println(jail2.location);
		SpecialJail jail3 = (SpecialJail) jail2;
		System.out.println(jail3.totalCases);
		System.out.println(jail3.advocateName);
		System.out.println(System.lineSeparator());

		Jail jail4 = new WomenJail();
		System.out.println(jail4.name);
		System.out.println(jail4.location);
		WomenJail jail5 = (WomenJail) jail4;
		System.out.println(jail5.jailName);
		System.out.println(jail5.location);
		System.out.println(System.lineSeparator());

	}

}
