class HospitalRunner{

	public static void main (String[] patientDetails){

		boolean isPatientRegistedSuccess = Hospital.registarPatient("Shreya B",'F',22,7259039098L,"A +ve","Kvoor Mangaluru");

		if(isPatientRegistedSuccess == true){
			Hospital.patientInfo();
		}
		else{
			System.out.println("Given Details Not Found");
		}
	}	



}