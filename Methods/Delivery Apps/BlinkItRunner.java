class BlinkItRunner{

   public static void main(String[] chicken){
   
      String foodName = "Butter";
	  int quantity = 4;
	  double food = BlinkIt.takeOrder(foodName);
	  System.out.println("Amount of "+foodName+" is "+food);
	  
	  double foods = BlinkIt.takeOrder(foodName,quantity);
	  System.out.println("Amount of "+quantity+" , " +foodName+" is "+foods);
	  
   
   }

}