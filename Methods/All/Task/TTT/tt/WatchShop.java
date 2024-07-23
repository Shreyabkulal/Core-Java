import java.util.*; 
class WatchShop{

 static String watchBrands[] = {null, null, null, null, null, null, null, null, null, null, null};
 static int index ;
 
 public static boolean addWatchBrandName(String brandsNames){
     System.out.println("Add Watech Brand Name Started ,,,,,,");
	  boolean isWatchBrandNameadded = false;
	   if(index < watchBrands.length){
	     if(brandsNames != null){
		  watchBrands[index] = brandsNames;
		    index++;
		  isWatchBrandNameadded = true;
		 }
		 else{
		 System.out.println("Please Provid valid Brand Names !!!!!!!!");
		 }
	   }
	   else{
		   System.out.println("Brand Names Are Already full !!!!!!");
		   }
	 
	 System.out.println("Add Watch Brand Name Ended");
  return isWatchBrandNameadded;	 
 }
 
  public static void getAllWatchBrands(){
	System.out.println("The Available Watch Brands Are ,,,,");
	for(String watchBrand : watchBrands){
	   System.out.println(watchBrand);
	}
  }
  
  public static boolean updateWatchBrand(String oldBrand , String newBrand){
    System.out.println("Update Watch Brand Started");
	 boolean isWatchBrandUpdated = false;
	  for(int index = 0 ; index < watchBrands.length ; index++){
	   if(oldBrand == watchBrands[index]){
	     watchBrands[index] = newBrand;
		 isWatchBrandUpdated = true;
	   }
	  }
	  if(isWatchBrandUpdated == false){
	     System.out.println(oldBrand+"is Not Found");
	  }
	System.out.println("Update Watch Brand Ended");
	return isWatchBrandUpdated ;
  }

   public static boolean deleteWatchBrand(String brandNameToBeDeleted){
	  System.out.println("deleteWatchBrand started");
	  boolean isWatchBrandDeleted = false;
	  int newIndex, oldIndex;
	  for(newIndex=0,oldIndex=0;oldIndex<watchBrands.length;oldIndex++){
		if(watchBrands[oldIndex] != brandNameToBeDeleted){
			watchBrands[newIndex] = watchBrands[oldIndex];
			newIndex++;
		}else isWatchBrandDeleted = true;  
	  }
	  watchBrands = Arrays.copyOf(watchBrands, newIndex);
	  
	  if(isWatchBrandDeleted == false){
		  System.out.println(brandNameToBeDeleted+" not found");
	  }
	  
	  System.out.println("deleteWatchBrand ended");
	  return isWatchBrandDeleted;
  }

}