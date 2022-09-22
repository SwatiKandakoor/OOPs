class GroceryStore{
	static String superMarket="Dmart";
	static int noOfDmart=10;
	static String location;
	static long areaDiameter;
	static String items;
	static double noOfItems;
	static String fruits;
	static String noOfFruits;
	static String vegetable;
	static String noOfVegetable;
	static String payment;
	static long price=3487l;
	
	static void setLocation(String place)
	{
		location=place;
	}
	static String getLocation(){
		if(location=="Bangalore"){
			System.out.println("the location of Store :"+location);
			return "true";
		}
		return "false";
	}
	
	
	static void setAreaDiameter(long length){
		areaDiameter=length;
	}
		static long getAreaDiameter(){
			System.out.println("the area is about:"+areaDiameter);
			return 0l;
		}
		
	static void setItems(String grains){
		items=grains;
	}
	static String getItems(){
		System.out.println("the name of item :"+items);
		return null;
	}
	

	static void setNoOfItems(int no,String fruits,String vegetable){
		noOfItems=no;
		noOfFruits=fruits;
		noOfVegetable=vegetable;
	}
	static int getNoOfItems(){
		System.out.println("the number of items of fruits & vegetables");
		System.out.println(noOfItems);
		System.out.println(noOfFruits);
		System.out.println(noOfVegetable);
		
		return 0;
	}
	
	static void setPayment(String payMode){
		payment=payMode;
	}
	static String getPayment(){
		System.out.println("The paymnet is in :"+payment);
		return null;
	}
	public static void main(String[] args){
	
	
	System.out.println("the name of store is:"+GroceryStore.superMarket);
	System.out.println("the no store is:"+GroceryStore.noOfDmart);
	
	
	String place="Bangalore";
	GroceryStore.setLocation(place);
	String location =GroceryStore.getLocation();
	System.out.println(location);
	
	long length=9786765l;
	GroceryStore.setAreaDiameter(length);
	long areaDiameter=GroceryStore.getAreaDiameter();
	System.out.println(areaDiameter);
	
	String grains="Greengram";
	GroceryStore.setItems(grains);
	String items=GroceryStore.getItems();
	System.out.println(items);
	
	int no=10;
	String friuts="5:WaterMelon";
	String vegetable="5-Carrot";
	GroceryStore.setNoOfItems(no,friuts,vegetable);
	int number=GroceryStore.getNoOfItems();
	System.out.println(number);
	
	String payMode="online";
	GroceryStore.setPayment(payMode);
	GroceryStore.getPayment();
	
	System.out.println("the total amount is: "+GroceryStore.price);
	
	
	}
}	