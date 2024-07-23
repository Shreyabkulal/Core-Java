import java.util.*;
class Liberty{

       static String brandNames[] ={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,};
        static int index ;
		
          public static boolean addShoeBrands(String names){
		  System.out.println("The Shoe Name Started");
		  boolean isShoeNameAdded = false;
		  if(index < brandNames.length){
		    if(names!=null){
			        brandNames[index] =names;
					   index++;
					isShoeNameAdded= true;
					   
			}else{
			   System.out.println("The Brand Name Should Not Be null");
			}
		  }else{
			    System.out.println("The Brand Place Is Already filled");
			}
		
		  System.out.println("The Shoe Name Ended");
		    return isShoeNameAdded;
		  
		  }
		  
		   public static void getAllShoeBrands(){
			   System.out.println("The Available Brands Are");
			   for(String brandName : brandNames)
				   System.out.println(brandName);
			   
		   }
		   
		   public static boolean updateShoeBrand(String oldBrand , String newBrand){
			   
			   System.out.println("Update Started");
			   boolean isShoeBrandUpdated = false;
			   for(int index = 0 ; index< brandNames.length ; index++){
				   if(oldBrand == brandNames[index]){
					       brandNames[index]= newBrand;
						   isShoeBrandUpdated = true;
				   }
			   }	   
				   if(isShoeBrandUpdated == false){
					   System.out.println(oldBrand + "Not Found");
			   }
			  
			   System.out.println("Update Ended");
			   
			   return isShoeBrandUpdated;
			   
		   }
		   
	public static boolean deleteShoeBrand(String shoeBrandToBeDeleted){
	  System.out.println("deleteShoeBrand started");
	  boolean isShoeBrandDeleted = false;
	  int newIndex, oldIndex;
	  for(newIndex=0,oldIndex=0;oldIndex<brandNames.length;oldIndex++){
		if(brandNames[oldIndex] != shoeBrandToBeDeleted){
			brandNames[newIndex] = brandNames[oldIndex];
			newIndex++;
		}else isShoeBrandDeleted = true;  
	  }
	  brandNames = Arrays.copyOf(brandNames, newIndex);
	  
	  if(isShoeBrandDeleted == false){
		  System.out.println(shoeBrandToBeDeleted+" not found");
	  }
	  
	  System.out.println("deleteShoeBrand ended");
	  return isShoeBrandDeleted;
  }
}