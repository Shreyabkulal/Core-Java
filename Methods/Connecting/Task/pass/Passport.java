class Passport{
	static String cpvLoc;
	static int dcdrLoc;
	static String sName;
	static String giName;
	static String birthDate;
	static String mailId;
	static boolean isLoginsm;
	static String logId;
	static String pass;
    static String confrm;
	static String hntQue;
	static String hntAns;
    static String cap;	
public static boolean createPassport(String cpvLocation, int dcdrLocation, String surName,                  //wtever u pass here is parameter in the()//
String givenName, String dob, String email, boolean isEmailLoginSame,String loginId,String pwd,
String confirmed,String hintQues, String hintAns,String captcha){
	 boolean isPassportDataCreated = false;
	 
	 
	 
	 boolean isDcdrLocationValid = false;
	 boolean isSurNameValid = false;
	 boolean isEmailLoginSameValid = false;
	 boolean isGivenNameValid = false;
	 
	 if( dcdrLocation > 0){
	       dcdrLoc = dcdrLocation;
		   isDcdrLocationValid = true;
	 
	 }else{
	  System.out.println("Please provide valid dcdrLocation");
	 }
	 
	 if(surName != null){
	    sName = surName;
		isSurNameValid = true;
	 
	 }else{
	 System.out.println("Please provide valid Sur name");
	 
	 }
	 if(isEmailLoginSame != false){
	     isLoginsm = isEmailLoginSame;
         isEmailLoginSameValid = true;		 
	 } else{
	 System.out.println("Please provide valid isEmailLoginSame value");
	 
	 }
	 if(givenName != null){
	    giName = givenName;
		isGivenNameValid = true;
	 
	 }else{
	 System.out.println("Please provide valid given name");
	 }
	 if(isDcdrLocationValid && isEmailLoginSameValid && isSurNameValid && isGivenNameValid){
	 isPassportDataCreated = true;
	 }
return isPassportDataCreated;
}

public static void getPassportDetails(){
	System.out.println("The cpv location is: " +cpvLoc);
	System.out.println("The dcdr location is: " +dcdrLoc);
	System.out.println("The surname is :"+sName);
	System.out.println("The name is: " +giName);
	System.out.println("date of birth is: " +birthDate);
	System.out.println("email is :" +mailId);
	System.out.println("login email same as email :" +isLoginsm);
	System.out.println("login ID is: " +logId);
	System.out.println("password is: " +pass);
	System.out.println("confirm password:"+confrm);
	System.out.println("hint question is:"+hntQue);
	System.out.println("hint answer is:" +hntAns);
	System.out.println("captcha is:" +cap);
}
}


i took headBath()