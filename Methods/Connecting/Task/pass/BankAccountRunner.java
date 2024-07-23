class BankAccountRunner{
 
  public static void main(String[] bank){
  
  double amount = 1000;
  BankAccount.credit(amount);
  double allBalance = BankAccount.getBalance();
  System.out.println("Balance = "+allBalance);
  
    amount = 2000;
   BankAccount.credit(amount);
   allBalance = BankAccount.getBalance(); 
   System.out.println("Balance = "+allBalance);
   
    amount = 3000;
   BankAccount.credit(amount);
   allBalance = BankAccount.getBalance(); 
   System.out.println("Balance = "+allBalance);
   
    amount = 0;
   BankAccount.credit(amount);
   allBalance = BankAccount.getBalance(); 
   System.out.println("Balance = "+allBalance);
   
    amount = 30000;
   BankAccount.debit(amount);
   allBalance = BankAccount.getBalance(); 
   System.out.println("Balance = "+allBalance);
  
  
  }

}