class Passport{
	
	static String cprLocat;
	static int dcdrLocat;
	static String surNam;
	static String givenNam;
	static String dobb;
	static String emaile;
	static boolean isEmailLoginSa;
	static String loginIdp;
	static String pwdd;
	static String confirmPw;
	static String hintQue;
	static String hintAn;
	static String captch;


   public static boolean createPassport(String cprLocation,int dcdrLocation, String surName,String givenName,String 
dob,String email,boolean isEmailLoginSame,String loginIdpwd , 
String pwd, String confirmPwd,String hintQues,String hintAns,String captcha ){
	
	cprLocat=cprLocation;
	dcdrLocat=dcdrLocation;
	surNam=surName;
	givenNam=givenName;
	dobb=dob;
	emaile=email;
	isEmailLoginSa=isEmailLoginSame;
	loginIdp=loginIdpwd;
	pwdd=pwd;
	confirmPw=confirmPwd;
	hintQue=hintQues;
	hintAn=hintAns;
	captch=captcha;
	
       
	  boolean isPassportDataCreate = false;
   
      return isPassportDataCreate;
   
   }
   
   public static void getPassportDetails(){
	   
	   System.out.println("The cpr location is : "+cprLocat);
	   System.out.println("The dcdr location is : "+dcdrLocat);
	   System.out.println("The surName is : "+surNam);
	   System.out.println("The givenName is : "+givenNam);
	   System.out.println("TDate of Birth is : "+dobb);
	   System.out.println("email is : "+emaile);
	   System.out.println("is Email Log in Same is : "+isEmailLoginSa);
	   System.out.println("loginIdpwd is : "+loginIdp);
	   System.out.println("password is : "+pwdd);
	   System.out.println("confirmPwd is : "+confirmPw);
	   System.out.println("hintQues is : "+hintQue);
	   System.out.println("hintAns is : "+hintAn);
	   System.out.println("captcha : "+captch);
	   
   }

}
//pdln development