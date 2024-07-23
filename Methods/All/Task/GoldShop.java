class GoldShop{
	static String goldItems[]={null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addGoldItem(String goldName){
		System.out.println("addGoldItem started");  
	  boolean isGoldItemAdded = false;
	  if(goldName != null){
		 goldItems[index] = goldName;
		 index++;
		 isGoldItemAdded = true;
	  }else System.out.println("Please enter valid name");  
	  System.out.println("addGoldItem ended");
	  return isGoldItemAdded;		
	}
	
    public static void getAllGoldItems(){	
		System.out.println("getAllGoldItems started");
	  for(String gold: goldItems)
		System.out.println(gold);
	  System.out.println("getAllGoldItems ended");
	  return;
    }
	
	public static boolean updateGoldItem(String oldGoldItem,String newGoldItem){
		System.out.println("updateGoldItem started");
		boolean isGoldItemUpdated = false;
		for(int index=0;index<goldItems.length;index++){
			if(oldGoldItem==goldItems[index]){
				goldItems[index]=newGoldItem;
				isGoldItemUpdated=true;
			}
		}
		if(isGoldItemUpdated==false){
			System.out.println(oldGoldItem+" not found");
		}
		System.out.println("updateGoldItem ended");
		return isGoldItemUpdated;
	}

}