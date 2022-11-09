package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.DistrictCourt;
import com.xworkz.inheritance.child.HighCourt;
import com.xworkz.inheritance.child.SupremeCourt;
import com.xworkz.inheritance.things.Court;

public class CourtRunner {

	public static void main(String[] args) {
		SupremeCourt supreme = new SupremeCourt();
		System.out.println(supreme.name);
		System.out.println(supreme.noStaffs);
		System.out.println(supreme.judgeName);
		System.out.println(supreme.location);
		System.out.println(System.lineSeparator());

		Court court = new SupremeCourt();
		System.out.println(court.name);
		System.out.println(court.noStaffs);
		//if(SupremeCourt !=court) {
		SupremeCourt court2 = (SupremeCourt) court; // type casting
		System.out.println(court2.judgeName);
		System.out.println(court2.location);
		System.out.println(System.lineSeparator());

		Court court3 = new HighCourt();
		System.out.println(court3.name);
		System.out.println(court3.noStaffs);
		HighCourt court4 = (HighCourt) court3; // type casting
		System.out.println(court4.judgeName);
		System.out.println(court4.highCourtPlace);
		System.out.println(System.lineSeparator());

		Court court5 = new DistrictCourt();
		System.out.println(court5.name);
		System.out.println(court5.noStaffs);
		DistrictCourt court6 = (DistrictCourt) court5; // type casting
		System.out.println(court6.totalArea);
		System.out.println(court6.noOfDistCourt);

	}

}
