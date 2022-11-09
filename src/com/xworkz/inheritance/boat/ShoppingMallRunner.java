package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.Orion;
import com.xworkz.inheritance.things.ShoppingMall;

public class ShoppingMallRunner {

	public static void main(String[] args) {
		ShoppingMall mall = new Orion("Metro-Goldwyn-Mayer ", "Dr. Rajkumar Road, Malleshwaram");
		mall.display();

		System.out.println(System.lineSeparator());

		ShoppingMall mall1 = new Orion("Metro-Goldwyn-Mayer ", "Dr. Rajkumar Road, Malleshwaram", 2345);
		mall1.display();
	}
}
