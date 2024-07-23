import java.util.*;
class ChatShop{

  static String name = "Amma";
  static String shopOwner = "Shreya B"; 
  static String chatNames[]={null,null,null,null,null,null};
  static double chatPrice[]={0.0,0.0,0.0,0.0,0.0,0.0};
  static int cIndex;
  static int pIndex;   
  
  public static boolean createChatName(String chatName){
   System.out.println("createChatName started"); 
   boolean isChatNameAdded = false;
   if(chatName != null){
	   chatNames[cIndex] = chatName;
	   cIndex++;
	   isChatNameAdded = true;
   }else System.out.println("Null value cannot be added");   
   System.out.println("createChatName ended");
   return isChatNameAdded;
  }
  
  
  public static void getChatNames(){
	 System.out.println("getChatNames started"); 
	 for(String chatn:chatNames)
		 System.out.println(chatn);  
	 System.out.println("getChatNames ended");
  }
  
  
  public static boolean addChatPrice(double price){
	 System.out.println("addChatPrice started");
	 boolean isChatPriceAdded=false;
	 if(price > 0.0){
		 chatPrice[pIndex]=price;
		 pIndex++;
		 isChatPriceAdded=true;
	 }else System.out.println("Enter the valid price");
     System.out.println("addChatPrice ended");	 
	 return isChatPriceAdded ;
  } 
  
  
  
  public static void getChatPrice(){
	 System.out.println("getChatNames started");
	 for(double chatp:chatPrice)
		 System.out.println(chatp);
	 System.out.println("getChatNames ended");
  }
  
  
  public static boolean updateChatName(String oldChatName, String newChatName){
	  System.out.println("updateChatName Started");
	  boolean isChatNameUpdated = false;
	  for(int index = 0; index < chatNames.length; index++ ){
		  if(oldChatName == chatNames[index]){
			  chatNames[index] = newChatName;
			  isChatNameUpdated = true;
		  }
	  }
	  if(isChatNameUpdated==false){
		  System.out.println("not found"+oldChatName);	  
	  }	  
	  System.out.println("updateChatName ended");
	  return isChatNameUpdated;
	  
  }
  
  public static boolean deleteChatName(String chatNameToBeDeleted){
	  System.out.println("deleteChatName started");
	  boolean isChatNameDeleted=false;
	  int newIndex, oldIndex;
	  for(newIndex=0, oldIndex=0; oldIndex<chatNames.length; oldIndex++){
		  if(chatNames[oldIndex] != chatNameToBeDeleted){
			  chatNames[newIndex] = chatNames[oldIndex];
			  newIndex++;
		  }
	  }
	  chatNames = Arrays.copyOf(chatNames, newIndex);
	  if(chatNames != null){
		  isChatNameDeleted = true;
	  }
	  if(isChatNameDeleted == false){
		  System.out.println(chatNameToBeDeleted+" not found");
	  }
	  System.out.println("deleteChatName ended");
	  return isChatNameDeleted;
  }

}