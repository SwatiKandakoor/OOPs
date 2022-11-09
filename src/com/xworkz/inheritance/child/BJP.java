package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.PoliticalParty;

public class BJP extends PoliticalParty {
	public String location;
	
	public BJP(String partyName, int noOfMembers) {
		super(partyName,noOfMembers);
	}
	
    public BJP(String partyName, int noOfMembers,String location) {
    	this(partyName,noOfMembers);
    	this.location=location;
    }
    public void display() {
    	super.display();
    	System.out.println(location);
    }
}
