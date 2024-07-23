class FactorialRunner{

    public static void main(String[] factorial){
	
	System.out.println("Main method started");
	
	int factNum=5;
	
	int fact=Factorial.getFact(factNum);
	
	System.out.println("The factorial of "+factNum+" is "+fact);
	
	System.out.println("Main method ended");
	
	}
}

//n!