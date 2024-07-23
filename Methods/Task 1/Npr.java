class Npr{

   public static void main(String[] npr){
	   
	   int n = 5;
	   int r = 2;
   
   int nprValue = Factorial.getFact(n)/Factorial.getFact(n-r);
   System.out.println("The permutation value of n:"+n+" r:"+r+" is "+nprValue);
   
   }
   
}

//n!/(n-r)!


