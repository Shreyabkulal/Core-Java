class Textiles{
	
	static String materials[]={null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMaterial(String material){
		System.out.println("addMaterial started");  
	  boolean isMaterialAdded = false;
	  if(material != null){
		 materials[index] = material;
		 index++;
		 isMaterialAdded = true;
	  }else System.out.println("Please enter valid name");  
	  System.out.println("addMaterial ended");
	  return isMaterialAdded;		
	}
	
    public static void getAllMaterialInfo(){	
		System.out.println("getAllMaterialInfo started");
	  for(String met: materials)
		System.out.println(met);
	  System.out.println("getAllMaterialInfo ended");
	  return;
    }
	
	public static boolean updateMaterial(String oldMaterial,String newMaterial){
		System.out.println("updateMaterial started");
		boolean isMaterialUpdated = false;
		for(int index=0;index<materials.length;index++){
			if(oldMaterial==materials[index]){
				materials[index]=newMaterial;
				isMaterialUpdated=true;
			}
		}
		if(isMaterialUpdated==false){
			System.out.println(oldMaterial+" not found");
		}
		System.out.println("updateMaterial ended");
		return isMaterialUpdated;
	}
}