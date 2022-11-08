package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.ArrangeMarriage;
import com.xworkz.inheritance.things.Marriage;

public class MarriageRunner {
	public static void main(String[] args) {
		Marriage marriage=new ArrangeMarriage("Nayana", "Bagalkot", 200000);
		//ArrangeMarriage marriage=(ArrangeMarriage) marriage;
		System.out.println(marriage.name);
		System.out.println(marriage.location);
		System.out.println(marriage.totalPrice);
	}

}
