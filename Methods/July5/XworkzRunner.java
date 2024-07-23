class XworkzRunner{

  public static void main(String[] training){
  
    boolean isAccountCreatedSuccessfully = Xworkz.register("Shreya B", 7355667688L,"shreyabkulal@gamil.com","SDIT","B.E","Kavoor Mangalore");
	 if(isAccountCreatedSuccessfully == true){
	   Xworkz.gatherInfo();
	 }else{
	    System.out.println("The Provided Data Is Not Founded");
	 }
  
  }

}