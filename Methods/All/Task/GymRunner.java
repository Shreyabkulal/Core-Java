class GymRunner{
  public static void main(String[] gym){
	  System.out.println("main started");
  
  boolean a = Gym.createGymEquipment("Rowing Machine");
  System.out.println("is added "+a);  
  
  a = Gym.createGymEquipment("Treadmill"); 
  System.out.println("is added "+a);
  
  a = Gym.createGymEquipment("Elliptical Trainer");
  System.out.println("is added "+a);
  
  a = Gym.createGymEquipment("Stationary Bike");
  System.out.println("is added "+a);
  
  a = Gym.createGymEquipment("Stair Climber");
  System.out.println("is added "+a);
  
  a = Gym.createGymEquipment("Spin Bike");
  System.out.println("is added "+a);
  
  a = Gym.createGymEquipment("Recumbent Bike");
  System.out.println("is added "+a);
  
  a = Gym.createGymEquipment("Air Bike");
  System.out.println("is added "+a);
  
  Gym.getGymEquipments();
  
  boolean b = Gym.updateGymEquipment("Spin Bike","Treadmill Runner");
  System.out.println("is updated "+b);

  Gym.getGymEquipments();
  
  Gym.deleteGymEquipment("Spin Bike");
  System.out.println("main ended");

  }
}