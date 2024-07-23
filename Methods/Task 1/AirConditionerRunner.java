class AirConditionerRunner{

   public static void main(String[] ac){
	   
	   System.out.println("main started");
   
      //AirConditioner.getFeatures();
	  AirConditioner.onOrOff();
	  AirConditioner.onOrOff();
	  AirConditioner.onOrOff();
	  
	  AirConditioner.increaseTemperature();
	  AirConditioner.increaseTemperature();

	  AirConditioner.decreaseTemperature();
   
   System.out.println("main ended");
   
   }

}