class SportsMania{
	
	static String iplTeamNames[]={"RCB","Chennai Super Kings (CSK)","Delhi Capitals (DC)","Kolkata Knight Riders (KKR)","Mumbai Indians (MI)","Punjab Kings (PBKS)","Rajasthan Royals (RR)","Sunrisers Hyderabad (SRH)","Gujarat Titans (GT)","Lucknow Super Giants (LSG)"};
	static String top10BatsMen[]={"Babar Azam (Pakistan)","Virat Kohli (India)","Rohit Sharma (India)","Kane Williamson (New Zealand)","Quinton de Kock (South Africa)","David Warner (Australia)","Jonny Bairstow (England)","Shai Hope (West Indies)","Ross Taylor (New Zealand)","Shikhar Dhawan (India)"};
	static String top10Bowlers[]={"Trent Boult (New Zealand)","Josh Hazlewood (Australia)","Chris Woakes (England)","Jasprit Bumrah (India)","Shaheen Afridi (Pakistan)","Mujeeb Ur Rahman (Afghanistan)","Rashid Khan (Afghanistan)","Kagiso Rabada (South Africa)","Pat Cummins (Australia)","Mohammad Amir (Pakistan)"};
	static String top10IccTeamNames[]={"India","Australia","England","South Africa","New Zealand","Pakistan","Sri Lanka","West Indies","Bangladesh","Afghanistan"};

  public static void main(String[] cricket){
	  
	 System.out.println("IPL Team Names are:"+iplTeamNames.length);
	 for(String iplTeamName:iplTeamNames){
		 System.out.println(iplTeamName);
	 };
	 
	 System.out.println("\nTop 10 Bats Men are:"+top10BatsMen.length);
	 for(String top10BatsMenList:top10BatsMen){
		 System.out.println(top10BatsMenList);
	 };
	 
	 System.out.println("\nTop 10 Bowlers are:"+top10Bowlers.length);
	 for(String top10Bowler:top10Bowlers){
		 System.out.println(top10Bowler);
	 };
	 
	 System.out.println("\nTop 10 Icc Team Names are:"+top10IccTeamNames.length);
	 for(String top10IccTeamName:top10IccTeamNames){
		 System.out.println(top10IccTeamName);
	 };
  
  }


}