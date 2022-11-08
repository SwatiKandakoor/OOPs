package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.Cardiologist;
import com.xworkz.inheritance.child.Dentist;
import com.xworkz.inheritance.things.Doctor;
import com.xworkz.inheritance.child.ENT;

public class DoctorRunner {
	public static void main(String[] args) {
		Dentist dentist = new Dentist();
		System.out.println(dentist.name);
		System.out.println(dentist.income);
		System.out.println(dentist.age);
		System.out.println(dentist.fees);
		System.out.println(System.lineSeparator());

		Doctor doctor = new Dentist();
		System.out.println(doctor.name);
		System.out.println(doctor.income);
		Dentist doctor2 = (Dentist) doctor;
		System.out.println(doctor2.age);
		System.out.println(doctor2.fees);
		System.out.println(System.lineSeparator());

		Doctor doctor3 = new ENT();
		System.out.println(doctor3.name);
		System.out.println(doctor3.income);
		ENT doctor4 = (ENT) doctor3;
		System.out.println(doctor4.noOfStaffs);
		System.out.println(doctor4.noOfpatient);
		System.out.println(System.lineSeparator());

		Doctor doctor5 = new Cardiologist();
		System.out.println(doctor.name);
		System.out.println(doctor.income);
		Cardiologist doctor6 = (Cardiologist) doctor5;
		System.out.println(doctor6.name);
		System.out.println(doctor6.consultationFees);

	}
}
