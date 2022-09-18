class  VehicleRunner{
	public static void main (String [] args){
		  double names=Vehicle.transport("Bangalore","ilkal");
		  System.out.println(names);
		  
		  double names2=Vehicle.transport("Mubai","ilkal");
		  System.out.println(names2);
	
	      double name1=Vehicle.transport("Bangalore","Tumkur",2);
		  System.out.println(name1);
		  
		  boolean ref=Vehicle.transport("Mumbai");
		  System.out.println(ref);
		  
		  boolean ref1= Vehicle.transport("Mumbai",  8.30F);
		  System.out.println(ref1);
		  
		  boolean ref4= Vehicle.transport("Mumbai",  8.87F);
		  System.out.println(ref4);
		  
		  boolean ref2= Vehicle.transport(24);
		  System.out.println(ref2);
		  
		  boolean ref3= Vehicle.transport(25);
		  System.out.println(ref3);
	}
	
}