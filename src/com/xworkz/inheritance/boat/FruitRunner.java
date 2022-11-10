package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.Apple;
import com.xworkz.inheritance.things.Fruit;

public class FruitRunner {
	public static void main(String[] args) {
		Apple fruit = new Apple();
		fruit.display();
		
		System.out.println("-------");
		
		Apple fruit1=new Apple(200,"AppleFruit","yellow");
		fruit1.display();
	}

}
