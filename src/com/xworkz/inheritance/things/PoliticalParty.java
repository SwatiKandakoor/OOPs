package com.xworkz.inheritance.things;

public class PoliticalParty {
	
	public String partyName;
	public int noOfMembers;
	
	public PoliticalParty(String partyName, int noOfMembers) {
		
		this.partyName = partyName;
		this.noOfMembers = noOfMembers;
	}
	
	public void display() {
		System.out.println("Party Name :"+partyName);
		System.out.println("No of mambers :"+noOfMembers);
	}

}
