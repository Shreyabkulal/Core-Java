import java.util.*;
class Girias{
  static String homeAppliances[]={null,null,null,null,null,null,null,null,null,null,null,null};
  static int index;
  
  public static boolean createhomeAppliance(String homeAppliance){
	  System.out.println("createhomeAppliance started");	  
	  boolean isHomeApplianceAdded = false;
	  if(homeAppliance != null){
		 homeAppliances[index] = homeAppliance;
		 index++;
		 isHomeApplianceAdded = true;
	  }else System.out.println("Please enter valid name");	  
	  System.out.println("createhomeAppliance ended");
	  return isHomeApplianceAdded;  
  }
  
  public static void getHomeAppliances(){
    System.out.println("getHomeAppliances started");	  
	  for(String home: homeAppliances)
		System.out.println(home);	
	  System.out.println("getHomeAppliances ended");
	  return;
  }
  
  public static boolean updateHomeAppliance(String oldHomeAppliance,String newHomeAppliance){
	  System.out.println("updateHomeAppliance started");
	  boolean isUpdated=false;
	  for(int index=0;index<homeAppliances.length;index++){
		  if(oldHomeAppliance==homeAppliances[index]){
			  homeAppliances[index]=newHomeAppliance;
			  isUpdated=true;
		  }
	  }
	  if(isUpdated==false){
		  System.out.println(oldHomeAppliance+" not found");
	  }
	  System.out.println("updateHomeAppliance ended");
	  return isUpdated;
  } 

  public static boolean deleteHomeAppliance(String homeApplianceToBeDeleted){
	  System.out.println("deleteHomeAppliance started");
	  boolean isHomeApplianceDeleted = false;
	  int newIndex, oldIndex;
	  for(newIndex=0,oldIndex=0;oldIndex<homeAppliances.length;oldIndex++){
		if(homeAppliances[oldIndex] != homeApplianceToBeDeleted){
			homeAppliances[newIndex] = homeAppliances[oldIndex];
			newIndex++;
		}else isHomeApplianceAdded = true;  
	  }
	  homeAppliances = Arrays.copyOf(homeAppliances, newIndex);
	  
	  if(isHomeApplianceAdded == false){
		  System.out.println(homeApplianceToBeDeleted+" not found");
	  }
	  
	  System.out.println("deleteHomeAppliance ended");
	  return isHomeApplianceAdded;
  }  
}