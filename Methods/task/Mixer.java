class Mixer{
	
   static boolean isConnected;
   static int currentSpeed;
   static int minSpeed;
   static int maxSpeed = 6;   
   

   public static void onOrOff(){
   
   System.out.println("onOrOff started");
   
   if(isConnected == false){
	   
	  isConnected = true;
    System.out.println("Mixer turned on");	  
   }else if(isConnected == true){
	   
	   isConnected = false;
	  System.out.println("Mixer turned off"); 
   }
   
   System.out.println("onOrOff ended");
   
   return;
   } 
   
   
   public static void increaseSpeed(){
	   
	      System.out.println("increaseSpeed() started");
		  
		  if(isConnected == true){
			  
			  if(currentSpeed <= currentSpeed){
				  
				  currentSpeed = currentSpeed + 1;
				  
				  System.out.println("The current speed is "+currentSpeed);
			  }else{
				  System.out.println("Mixer is off");
			  }
			  			  
		  }
		  
		  System.out.println("increaseSpeed() ended");
	   
   }


}