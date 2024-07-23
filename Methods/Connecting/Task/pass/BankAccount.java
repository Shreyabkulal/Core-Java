class BankAccount{

  static double balance;
  
  public static void debit(double amount){
  
  System.out.println("Debit() started");
  
  if(amount<=balance){
	 balance = balance - amount; 
  }else{
	  System.out.println("Insufficient balance");
  }
  
  System.out.println("Debit() ended");
  
  return;
  
  }
  
  public static void credit(double amount){
  
  System.out.println("Credit() started");
  
  if(amount>0)
	 balance = balance + amount; 
  else
	  System.out.println("Amount can't be zero");
  
  
  System.out.println("Credit() ended");
  
  return;
  
  }
  
  public static double getBalance(){
  
  System.out.println("getBalance() started");
  
  System.out.println("Feching balance...");
  
  System.out.println("getBalance() ended");
  
  return balance;
  
  }

}