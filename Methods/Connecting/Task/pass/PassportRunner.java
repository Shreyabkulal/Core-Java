class PassportRunner{
public static void main(String[]args){
 //ClassName.MethodName(13)
 boolean isPassportDataCreated = Passport.createPassport("hjfty", 7, "ahgcvh", "kjgyu" ,"14/04/2000" , "kjgyug@gmail.com" , true, "87654" ,"bfy" ,"bfy" ,
 "colour" , "green" , "ttttt");
if(isPassportDataCreated == true){
	Passport.getPassportDetails();
} else {
	System.out.println("provided details are not found");
}




}


}