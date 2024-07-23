class Zomato{

    public static double takeOrder(String foodName){
	
     if (foodName == "dahi rice"){
     return 20.00;
     }
     if (foodName == "papad"){
     return 20.00;
     }
     if(foodName == "soup"){
     return 110.00;	
     }
     if(foodName == "dosa"){
     return 80.00;
     }
     if (foodName == "rava dosa"){
     return 50.00;
     }
	 if(foodName == "Pizza"){
	 
      return 99.00;
     }
     if(foodName == "burger"){
	 
      return 120.00;
     }
     if(foodName == "biryani"){
      return 220.00;
     }
     if(foodName == "idli"){
      return 60.00;
     }
     if (foodName == "vada"){
     return 50.00;
     }
     if (foodName == "ricebath"){
     return 64.00;
     }
     if (foodName == "curd rice"){
     return 70.00;
     }
     if (foodName == "rice"){
     return 40.00;
     }
     if (foodName == "raitha"){
     return 30.00;
     }
     if (foodName == "dahi rice"){
     return 20.00;
     }
     if (foodName == "papad"){
     return 20.00;
     }
     if(foodName == "soup"){
     return 110.00;	
     }
     if(foodName == "dosa"){
     return 80.00;
     }
     if (foodName == "rava dosa"){
     return 50.00;
     }
     if(foodName == "grain dosa"){
     return 80.00;
     }	
     else{
     System.out.println(foodName +"Not Found");
     }
     return 0.0;
    }

}