class AirConditioner{

   static boolean isConnected;
   static int currentTemperature;
   static int minTemperature;
   static int maxTemperature = 6;   
   

   public static void onOrOff(){
   
   System.out.println("onOrOff started");
   
   if(isConnected == false){
	   
	  isConnected = true;
    System.out.println("Air Conditioner turned on");	  
   }else if(isConnected == true){
	   
	   isConnected = false;
	  System.out.println("Air Conditioner turned off"); 
   }
   
   System.out.println("onOrOff ended");
   
   return;
   } 
   
   
   public static void increaseTemperature(){
	   
	      System.out.println("increaseTemperature started");
		  
		  if(isConnected == true){
			  
			  if(currentTemperature <= maxTemperature){
				  
				  currentTemperature = currentTemperature + 1;
				  
				  System.out.println("The current Temperature is "+currentTemperature);
			  }else{
				  System.out.println("Ac is off");
			  }
			  			  
		  }
		  
		  System.out.println("increaseTemperature ended");
	   
   }
   
   public static void decreaseTemperature(){
	   
	  System.out.println("decreaseTemperature started");
	  
	  if(isConnected== true){
		  
		  if(currentTemperature>minTemperature){
			  currentTemperature=currentTemperature-1;
			   System.out.println("The current Temperature is "+currentTemperature);
			  }else{
				  System.out.println("Ac is off");
			  }
		  }
	  
	  
	  
      System.out.println("decreaseTemperature ended");	  
	   
   }
   
   public static void getFeatures(){
	   
	   System.out.println("getFeatures() started");
	   
	   String brandName = "Samsung";
	   double price = 8000d;
	   
	    System.out.println("The Brand Name is "+brandName);
		System.out.println("The Brand Price is "+price);
	   
	   System.out.println("getFeatures() ended");
	   
	   return;
	      
   }
   
}