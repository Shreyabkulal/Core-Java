class Microwave{

  static boolean isConnected;
   static int currentTemperature;
   static int minTemperature;
   static int maxTemperature = 6;   
   

   public static void onOrOff(){
   
   System.out.println("onOrOff started");
   
   if(isConnected == false){
	   
	  isConnected = true;
    System.out.println("Microwave turned on");	  
   }else if(isConnected == true){
	   
	   isConnected = false;
	  System.out.println("Microwave turned off"); 
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
				  System.out.println("Microwave is off");
			  }
			  			  
		  }
		  
		  System.out.println("increaseTemperature ended");
	   
   }

}