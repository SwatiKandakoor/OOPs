package com.xworkz.inheritance.things;

public class Criminal {
	
	public String gender;
	public String criminalType;
	
	public Criminal(String gender, String criminalType) {
		super();
		this.gender = gender;
		this.criminalType = criminalType;
	}
	
	public void showOff() {
		System.out.println(gender);
		System.out.println(criminalType);
	}

}
