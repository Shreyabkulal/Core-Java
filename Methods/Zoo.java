class Zoo{
	
	static int ticketprice = 250;
	static int tea = 50;
	static int samosa = 25;
	static int frenchFry = 100;
	static int total =300;
   
   public static int issueTicketForAboveEighteen(int age){
	   
	 System.out.println("issueTicketForAboveEighteen() started");	 
	 
	 if( age < 18){
		 return ticketprice;
		 
	 }
	 else if(age>=18 && age<25){
		 return ticketprice + tea;
	 }
	 else if (age>=25 && age<30){
		 return ticketprice + tea + samosa;
	 }
	 else if (age>=30){
		 return ticketprice + tea + samosa + frenchFry;
	 }
	 return ticketprice;
   }
	
   }


 
	