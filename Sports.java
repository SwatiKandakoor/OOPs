class Sports{
	static void cricketTeamMembers(String[] names){
		System.out.println("Cricket Team Members names");
		System.out.println("The Cricket Team has "+ names.length + "players");
		for (int i=0;i<names.length;i++){
			System.out.println(names[i]);
		}
		System.out.println("<---------------->");
	}
	static void kabbadiTeamMembersJerseyNos(int[] nos){
		System.out.println("kabbadi Team Member Jersey Nos");
		System.out.println(" Total Jersey Nos "+ nos.length);
		for (int i=0;i<nos.length;i++){
			System.out.println(nos[i]);
		}
		System.out.println("<---------------->");
	}
	static void footBallTeamMembersSalary(double[] salaries){
		System.out.println("footBall Team Members Salaries");
		for (int j=0;j<salaries.length;j++){
		System.out.println(salaries[j]);
		}
		System.out.println("<---------------->");
	}
	static void ludoTeamMobileNumber(long[] nos){
		System.out.println("ludo Team Mobile Number are");
		for (int j=0;j<nos.length;j++){
		System.out.println(nos[j]);
		}
		System.out.println("<---------------->");
	}
	static void hockeyTeamMembersNoOfMatches(int[] matches){
		System.out.println("hockey Team Members No Of Matches");
		for (int j=0;j<matches.length;j++){
		System.out.println(matches[j]);
		}
		System.out.println("<---------------->");
	}
	static void kokoTeamMembersCountryCode(long[] names){
		System.out.println("koko Team Members Country Code");
		for (int j=0;j<names.length;j++){
		System.out.println(names[j]);
		}
	
	System.out.println("<---------------->");
	}
		static void lagoriTeamMembersAlive(boolean[] names){
		System.out.println("lagori Team Members A live");
		for (int j=0;j<names.length;j++){
		System.out.println(names[j]);
		}
	}

}