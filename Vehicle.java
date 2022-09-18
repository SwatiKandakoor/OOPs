class Vehicle{
	static  double transport(String source,String destination){
		System.out.println("Enter the source and destination");
		if(source=="Bangalore" && destination=="ilkal"){
			System.out.println("entered source is :"+source+ " and destination is :" + destination);	
			return 500d;
		}
		return 0d;
	}
		
	static double transport(String source,String destination,int ontime){
		if(source=="Bangalore" && destination=="Tumkur" && ontime==2){
			System.out.println("entered the source is :"+source+ "and destination is  :" +  destination  + "and ontime is"  + ontime );		
			return 100d;
		}
		return 0d;
	
	}
		
	static boolean transport(String destination){
		if(destination=="Mumbai"){
			System.out.println("entered  destination  is :" +  destination);
			return true;
			}
			return false;
	
	}
	static boolean transport(String destination, float ontime ){
		if(destination=="Mumbai" && ontime== 8.30f){
			System.out.println("entered destination is  :" + destination   +  " and ontime is:" + ontime);
			return true;
		 }
		  return false;
	}
	static boolean transport(int ontime ){
		if(ontime == 24){
			System.out.println( "ontime is :" + ontime);
			return true;
			
				
		}
		return false;
	}
}