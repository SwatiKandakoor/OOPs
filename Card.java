class Card{
	static String type;
	static long width;
	static int price;
	static String colours[];
	
	static void displayDetails(){
		System.out.println("main method");
	
	    
	 if (colours!=null){
	     System.out.println("colours length is :"+colours.length);
		for (int position=0;position<colours.length;position++){
			String typ=colours[position];
			System.out.println(typ+" position "+position);
		}
	} 
	else{
		System.out.println("null");
	}
	
	}
	
	
	
	
	public static void main(String [] args){
		System.out.println("Card Type :"+Card.type);
	    System.out.println("Card width :"+Card.width);
	    System.out.println("Card Price :"+ Card.price);
	    System.out.println("Card colours :"+Card.colours);
		
		Card.displayDetails();
	
		Card.type="Birthday card";
		Card.width=3;
		Card.price=80;
		String[] ref={"White","Red","Orange","Yellow","Purple","Gray","Pink","cream"};
		Card.colours=ref;
		
		Card.displayDetails();
		System.out.println("Card Type :"+Card.type);
	    System.out.println("Card width :"+Card.width);
	    System.out.println("Card Price :"+ Card.price);
	    System.out.println("Card colours :"+Card.colours);
		
		
		
	}
}