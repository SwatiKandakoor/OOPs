package com.xworkz.inheritance.boat;

import com.xworkz.inheritance.child.MarrigeShoot;
import com.xworkz.inheritance.things.PreWeddingShoot;

public class PreWeddingShootRunner {
	public static void main(String[] args) {
		PreWeddingShoot shoot = new MarrigeShoot(2, "Naveen", "Bangalore");
		System.out.println(shoot.camera);
		System.out.println(shoot.cameraManName);
		System.out.println(shoot.location);
		MarrigeShoot shoot1 = (MarrigeShoot) shoot;
		System.out.println(shoot1.dressCode);
		System.out.println(shoot1.cost);
		System.out.println(shoot1.chowtryName);

	}

}
