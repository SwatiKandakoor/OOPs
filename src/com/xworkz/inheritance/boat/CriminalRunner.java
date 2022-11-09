package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.Ravi;
import com.xworkz.inheritance.things.Criminal;

public class CriminalRunner {

	public static void main(String[] args) {
		Criminal criminal = new Ravi("Male", "Professional criminals", 24);
		criminal.showOff();
	}

}
