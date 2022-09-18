class Person{
	static void work(String company, long salary){
		System.out.println("Enter the company and salary");
		if (company=="Wipro" && salary==25000l){
			System.out.println("company name is "+  company + "one month salary is "  + salary);
		}
	}
		static void work (String company, long salary, String designation){
			if (company=="Wipro" && salary==25000l && designation=="ProjectEngineering"){
				System.out.println("company name is "+ company +  "one month salary is"  + salary  +  "Designation is "+  designation);		
				
			}
		}
		
}
