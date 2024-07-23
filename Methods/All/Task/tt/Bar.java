import java.util.*;
class Bar{

 static String wineBrands[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
 static int index ;
 
 public static boolean addWineBrands(String brandsNames){
     System.out.println("Add Wine Brand Started ,,,,,,");
	  boolean isWineBrandadded = false;
	   if(index < wineBrands.length){
	     if(brandsNames != null){
		  wineBrands[index] = brandsNames;
		    index++;
		  isWineBrandadded = true;
		 }
		 else{
		 System.out.println("Please Provid valid Brand Names !!!!!!!!");
		 }
	   }
	   else{
		   System.out.println("Brand Names Are Already full !!!!!!");
		   }
	 
	 System.out.println("Add Wine Brand Ended");
  return isWineBrandadded;	 
 }
 
  public static void getAllBrands(){
	System.out.println("The Available Wine Brands Are ,,,,");
	for(String wineBrand : wineBrands){
	   System.out.println(wineBrand);
	}
  }
  
  public static boolean updateWineBrand(String oldBrand , String newBrand){
    System.out.println("Update Brand Started");
	 boolean isWineBrandUpdated = false;
	  for(int index = 0 ; index < wineBrands.length ; index++){
	   if(oldBrand == wineBrands[index]){
	     wineBrands[index] = newBrand;
		 isWineBrandUpdated = true;
	   }
	  }
	  if(isWineBrandUpdated == false){
	     System.out.println(oldBrand+"is Not Found");
	  }
	System.out.println("Update Brand Ended");
	return isWineBrandUpdated ;
  }
  
    public static boolean deleteWineBrand(String brandNameToBeDeleted){
	  System.out.println("deleteWineBrand started");
	  boolean isWineBrandDeleted = false;
	  int newIndex, oldIndex;
	  for(newIndex=0,oldIndex=0;oldIndex<wineBrands.length;oldIndex++){
		if(wineBrands[oldIndex] != brandNameToBeDeleted){
			wineBrands[newIndex] = wineBrands[oldIndex];
			newIndex++;
		}else isWineBrandDeleted = true;  
	  }
	  wineBrands = Arrays.copyOf(wineBrands, newIndex);
	  
	  if(isWineBrandDeleted == false){
		  System.out.println(brandNameToBeDeleted+" not found");
	  }
	  
	  System.out.println("deleteWineBrand ended");
	  return isWineBrandDeleted;
  }


}