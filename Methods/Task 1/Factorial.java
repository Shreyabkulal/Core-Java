class Factorial{

    public static int getFact(int factNum){
	
	System.out.println("Fact method started");
	
	 int fact=1;
	 
	 for(int num=1; num<=factNum; num++){
	 
	   fact = num * fact;
	    
	 }
		
    System.out.println("Fact method ended");
      return fact;
	}

}

























