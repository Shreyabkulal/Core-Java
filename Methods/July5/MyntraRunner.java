class MyntraRunner{
public static void main (String[] shopping){

        boolean isAccountCreatedSuccessfully = Myntra.createAccount ("Shreya B" , 7259039098L , "shreyabkulal@gmail.com" , "hgdsxsc" , "Kavoor Mnagloru" , 575015);

           if(isAccountCreatedSuccessfully = true){
			   Myntra.getInfo();
			   
		   }else{
			   
			   System.out.println("The Provided Data Is Not Founded");
		   }
             

}
}