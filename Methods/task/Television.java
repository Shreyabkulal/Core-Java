class Television{
	
	static boolean isConnected;
   static int currentVolume;
   static int minVolume;
   static int maxVolume = 7;   
   

   public static void onOrOff(){
   
   System.out.println("onOrOff started");
   
   if(isConnected == false){
	   
	  isConnected = true;
    System.out.println("Television turned on");	  
   }else if(isConnected == true){
	   
	   isConnected = false;
	  System.out.println("Television turned off"); 
   }
   
   System.out.println("onOrOff ended");
   
   return;
   } 
   
   
   public static void increaseVolume(){
	   
	      System.out.println("increaseVolume() started");
		  
		  if(isConnected == true){
			  
			  if(currentVolume < maxVolume){
				  
				  currentVolume = currentVolume + 1;
				  
				  System.out.println("The current volume is "+currentVolume);
			  }else{
				  System.out.println("Television is off");
			  }
			  			  
		  }
		  
		  System.out.println("increaseVolume() ended");
		  return;
	   
   }
   
   
   
   public static void decreaseVolume(){
	   
	   System.out.println("decreaseVolume() ended");
	   
	   if(isConnected == true){
		   System.out.println("Television is connected...");
		   if(currentVolume > minVolume){
			   currentVolume = currentVolume - 1;
			   System.out.println("currentVolume is "+currentVolume);
			   
		   }else{
			   System.out.println("minVolume reached");
			   
		   }
		   
	   }else{
		   System.out.println("Television is turned off");
		   
	   }
	 System.out.println("decreaseVolume() started"); 
      
      return;	  
	   
   }




}