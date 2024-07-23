class Ncr{

  public static void main(String[] combination){
	  
	  int n = 5;
	  int r = 2;
  
    int outputVal = Factorial.getFact(n)/(Factorial.getFact(n-r)*Factorial.getFact(r));
	
	System.out.println("The combination of n:"+n+" r:"+r+" is "+outputVal);
  
  }

}

//n!/(n-r)!r!