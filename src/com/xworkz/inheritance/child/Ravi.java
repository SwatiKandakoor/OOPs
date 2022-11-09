package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.Criminal;

public class Ravi extends Criminal {

	public int age;

	public Ravi() {
		super("male", "pocketMoney");
	}

	public Ravi(String gender, String criminalType, int age) {
		super(gender, criminalType);
		this.age = age;
	}

	public void showOff() {
		super.showOff();
		System.out.println(age);
	}
}
