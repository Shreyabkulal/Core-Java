class LoanApplicationRunner{

	public static void main(String[] applyLoan){
			
			
		boolean isloanApplicable = LoanApplication.applyLoan("canara",2728543468096L,750,2.0,"Education Loan");
			
		if(isloanApplicable == true ){
		LoanApplication.getinfo();
		}else{
			System.out.println("Provided Detaisl not found");
		}
	}
		
			
			
			
			
			
			












}