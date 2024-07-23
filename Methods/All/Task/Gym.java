import java.util.*;
class Gym{

  static String gymEquipments[]={null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean createGymEquipment(String gymEquipment){
	  System.out.println("createGymEquipment started");
	  boolean isGymEquipmentAdded = false;
	  if(gymEquipment != null){
		 gymEquipments[index] = gymEquipment;
		 index++;
		 isGymEquipmentAdded = true;
	  }else System.out.println("Please enter valid name");
	  System.out.println("createGymEquipment ended");
	  return isGymEquipmentAdded;
  }

  public static void getGymEquipments(){
	  System.out.println("getGymEquipments started"); 
	  for(String gym: gymEquipments)
		System.out.println(gym);
	  System.out.println("getGymEquipments ended");
	  return;
  }

  public static boolean updateGymEquipment(String oldGymEquipment, String newGymEquipment){
	  System.out.println("updateGymEquipment started");
	  boolean isGymEquipmentUpdated=false;
	  for(int indexx = 0; indexx<gymEquipments.length ; indexx++){
		  if(oldGymEquipment == gymEquipments[indexx]){
			  gymEquipments[indexx] = newGymEquipment;
			  isGymEquipmentUpdated = true;
		  }
	  }
	  if(isGymEquipmentUpdated == false){
		  System.out.println(oldGymEquipment+" not found");
	  }
	  System.out.println("updateGymEquipment ended");
	  return isGymEquipmentUpdated;
  }

  public static boolean deleteGymEquipment(String gymEquipmentToBeDelete){
	  System.out.println("deleteGymEquipment started");
      boolean isGymEquipmentDeleted	 = false;
      int newIndex, oldIndex;
	  for(newIndex = 0, oldIndex = 0; oldIndex < gymEquipments.length; oldIndex++){
		  if(gymEquipments[oldIndex] != gymEquipmentToBeDelete){
			 gymEquipments[newIndex] = gymEquipments[oldIndex];
             newIndex++;			 
		  }
	  }
	  gymEquipments = Arrays.copyOf(gymEquipments, newIndex);
      if(gymEquipments != null){
		  isGymEquipmentDeleted = true;
	  }
      if(isGymEquipmentDeleted == false){
		  System.out.println(gymEquipmentToBeDelete+" not found");
	  } 	  
      System.out.println("deleteGymEquipment ended");
      return isGymEquipmentDeleted; 	  
  }  
}