class Speaker{
	
   static boolean isConnected;
   static int currentVolume;
   static int minVolume;
   static int maxVolume = 6;   
   

   public static void onOrOff(){
   
   System.out.println("onOrOff started");
   
   if(isConnected == false){
	   
	  isConnected = true;
    System.out.println("Speaker turned on");	  
   }else if(isConnected == true){
	   
	   isConnected = false;
	  System.out.println("Speaker turned off"); 
   }
   
   System.out.println("onOrOff ended");
   
   return;
   }

   public static void increaseVolume(){
	   
	      System.out.println("increaseVolume() started");
		  
		  if(isConnected == true){
			  
			  if(currentVolume <= maxVolume){
				  
				  currentVolume = currentVolume + 1;
				  
				  System.out.println("The current volume is "+currentVolume);
			  }else{
				  System.out.println("Speaker is off");
			  }
			  			  
		  }
		  
		  System.out.println("increaseVolume() ended");
	   
   }



}