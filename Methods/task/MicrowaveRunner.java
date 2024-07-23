class MicrowaveRunner{

   public static void main (String[] mix){
  
  System.out.println("main started");
  
  Microwave.onOrOff();
  Microwave.onOrOff();
  Microwave.onOrOff();
  Microwave.increaseTemperature();
  Microwave.increaseTemperature();
  
  
  System.out.println("main ended");
}

}