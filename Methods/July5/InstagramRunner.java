class InstagramRunner{

	public static void main(String[] newAccount){
		
	boolean isLoginsuccess =	Instagram.instaLogin("Shreya","B",7250939098L,"shreyabkulal@gamil.com","hjgtfc","hjgtfc");
		
		if(isLoginsuccess == true){
		       Instagram.login();
		}else{
			System.out.println("Provided Details Not Found");
		}
	}




}