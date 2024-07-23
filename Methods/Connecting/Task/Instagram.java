class Instagram{
	
	static  String name;
	static  String lName;
	static String dobb;
	static long phoneno;
	static  String mail;
	static String cPassword  ;
	static String conPassword ;
	

    public static boolean createAccount(String fullName , String lastName ,String dob  ,
	long mobilNo , String gmail , String password , String confPassword){
 
     boolean isAccountCreated = false;
	 
	name = fullName;
	lName = lastName;
	dobb = dob;
	phoneno = mobilNo;
	mail = gmail;
	cPassword  = password ;
	conPassword = confPassword ;
	
	return isAccountCreated ;
	 
 }
	
    public static void getInstagramDetails(){
		
	
	System.out.println("FULL NAME = "+ name);
	System.out.println("LAST NAME = "+ lName);
	System.out.println("DATE OF BIRTH = "+ dobb);
	System.out.println("ENTER PHONE NUMBER = "+ phoneno);
	System.out.println("ENTER E-MAIL = "+ mail);
    System.out.println("CREATE PASSWORD = "+ cPassword);
	System.out.println("CONFORM PASSWORD = "+ conPassword);
	}


}