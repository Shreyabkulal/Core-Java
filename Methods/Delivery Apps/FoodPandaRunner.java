class FoodPandaRunner{

   public static void main(String[] chicken){
   
      String foodName = "Pizza";
	  int quantity = 3;
	  double food = FoodPanda.takeOrder(foodName);
	  System.out.println("Amount of "+foodName+" is "+food);
	  
	  double foods = FoodPanda.takeOrder(foodName,quantity);
	  System.out.println("Amount of 3, "+foodName+" is "+foods);
   
   }

}