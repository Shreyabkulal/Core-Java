class Bill{
	
	 static int billId = 200;
	 static String billIssuedDate = "12/06/2024";
	 static String billDueDate = "25/06/2024";
     static boolean isBillPaid = false;
	 static boolean isLatestBill = true;

   public static void main(String jioBill[]){
    
	 
	 
	 System.out.println("---------------------------");
	 System.out.println("The Bill Id is : "+billId);
	 System.out.println("The Bill is Issued on : "+billIssuedDate);
	 System.out.println("The Bill is Due Date is : "+billDueDate);
	 //System.out.println("Is the bill paid? "+isBillPaid);
	 //System.out.println("IS that the latest bill? "+isLatestBill);
	 System.out.println("Is bill paid: "+isBillPaid);
	 System.out.println("Is Latest Bill: "+isLatestBill);
	 System.out.println("---------------------------");
	 
   
   
   }

}