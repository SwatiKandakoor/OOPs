package com.xworkz.inheritance.child;

import com.xworkz.inheritance.things.PreWeddingShoot;

public class MarrigeShoot extends PreWeddingShoot{
	
	public String dressCode;
	public double cost;
	public String chowtryName;
	
	
	public MarrigeShoot(int camera, String cameraManName, String location, String dressCode, double cost,
			String chowtryName) {
		super(camera, cameraManName, location);
		this.dressCode = dressCode;
		this.cost = cost;
		this.chowtryName = chowtryName;
	}



	public MarrigeShoot(int camera, String cameraManName, String location) {
		super(camera,cameraManName,location);
	}

}
