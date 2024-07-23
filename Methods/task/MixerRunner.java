class MixerRunner{

  public static void main (String[] mix){
  
  System.out.println("main started");
  
  Mixer.onOrOff();
  Mixer.onOrOff();
  Mixer.onOrOff();
  Mixer.increaseSpeed();
  Mixer.increaseSpeed();
  Mixer.increaseSpeed();
  
  System.out.println("main ended");

}

}