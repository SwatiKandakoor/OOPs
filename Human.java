class Human{
	static String personname="Anamika";
	static int weight=58;
	static int eyes=2;
	static int brain=1;
	static String  hairs="infinity";
	static int hands=2;
	static byte fingers=20;
	static byte legs=2;
	static byte tongue=1;
	static byte neck=1;
	static byte liver=1;
	static byte ears=2;
	static char blood='A';
	static byte mouth=1;
	static byte stomach=1;
	static int teeth=32;
	static float hight=5.2f;
	static String[] activities={"Sleeping","walking","Bathing","eating","Dressing","Reading paper","working","Brushing teeth","Exercise","Entertainment","Thinking","Drinking"};
	
	static void activitiess(){
		System.out.println(activities.length);
		for (int index=0;index<activities.length;index++){
			String ref=activities[index];
			System.out.println(ref);
		}
	}
	
	 public static void main(String [] args){
		System.out.println("Name :"+ Human.personname);
		System.out.println("weight :"+Human.weight);
		System.out.println("eyes :"+Human.eyes);
		System.out.println("brain :"+Human.brain);
		System.out.println("hairs :"+Human.hairs);
		System.out.println("hands :"+Human.hands);
		System.out.println("fingers :"+Human.fingers);
		System.out.println("legs :"+Human.legs);
		System.out.println("tongue :"+Human.tongue);
		System.out.println("neck :"+Human.neck);
		System.out.println("liver :"+Human.liver);
		System.out.println( "ears :"+Human.ears);
		System.out.println("blood :"+Human.blood);
		System.out.println("mouth :"+Human.mouth);
		System.out.println("stomach :"+Human.stomach);
		System.out.println("teeth :"+Human.teeth);
		System.out.println("hight :"+Human.hight);
		System.out.println("activities :"+Human.activities);
		
		Human.activitiess();
		
	}
}