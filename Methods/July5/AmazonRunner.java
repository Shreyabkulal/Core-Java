class AmazonRunner{
 
 public static void main(String[] login){
	 
	 boolean isAccountCreated = Amazon.creatAccount("Shreya B",7259039098L,"shreyabkulal@gmail.com","Kavoor Mangalore",87556);
	 
	 if(isAccountCreated==true){
		 Amazon.details();
	 }
	 else{
		 System.out.println("Details Not Found");
	 }
 }



}