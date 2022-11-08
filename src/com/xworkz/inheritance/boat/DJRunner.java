package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.Events;
import com.xworkz.inheritance.things.DJ;

public class DJRunner {
	public static void main(String[] args) {

		DJ dj = new Events(3, 6, 15);
		System.out.println(dj.singers);
		System.out.println(dj.totalDancers);
		System.out.println(dj.totalMembers);
	}

}
