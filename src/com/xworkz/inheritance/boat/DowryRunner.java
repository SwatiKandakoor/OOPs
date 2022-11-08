package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.MarriageDowry;
import com.xworkz.inheritance.things.Dowry;

public class DowryRunner {
	public static void main(String[] args) {
        Dowry dowry=new MarriageDowry(200000, 5, 2);
        System.out.println(dowry.amount);
        System.out.println(dowry.gold);
        System.out.println(dowry.property);
	}

}
