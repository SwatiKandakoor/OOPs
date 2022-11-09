package com.xworkz.inheritance.things;

public class Director {
	public String movieName;
	public String directorName;
	
	public Director(String movieName, String directorName) {
		super();
		this.movieName = movieName;
		this.directorName = directorName;
	}
	public void display() {
		System.out.println("Movie name :"+movieName);
		System.out.println("Director Name :"+directorName);
	}
	
	

}
