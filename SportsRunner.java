class SportsRunner{
	public static void main(String[] args){
		String[] names={"Virat Kohli","Dinesh Karthik","Shikhar Dhawan","Jadeja","Rohit Sharma","Umesh Yadav","Harshal Patel"," Chahal"," KL Rahul"," Bumrah"," Kuldeep Yadav"};
		Sports.cricketTeamMembers(names);
		
		int [] nos={2,4,3,5,6,7,9,8,10,1};
		Sports.kabbadiTeamMembersJerseyNos(nos);
		
		double[] salaries={64000,78000,980800,100000,97000,95000,789000,670000,78600,909999};
		Sports.footBallTeamMembersSalary(salaries);
		
		long[] nos1={6364535754l,8767938302l,9900238734l,9900775088l,7259303408l,9741426746l,8310437144l,8088245073l,9380894119l,9980361822l};
		Sports.ludoTeamMobileNumber(nos1);
		
		int[] matches={45,70,10,4,75,34,50,25,12,18};
		Sports.hockeyTeamMembersNoOfMatches(matches);
		
		long[] names1={91l,84l,21l,99l,45l,89l,78l,92l,65l,86l};
		Sports.kokoTeamMembersCountryCode(names1);
		
		boolean[] type={true,false};
		Sports.lagoriTeamMembersAlive(type);
	}
}