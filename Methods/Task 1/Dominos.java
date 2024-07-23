class Dominos{

  public static double takeOrder(String foodName){
  
    if(foodName == "Paneer Pizza"){
	   return 350.00;	
	}
	if(foodName == "Chicken Pizza"){
	   return 170.00;
	}
	if(foodName == "Tandoor Chicken Pizza"){
	   return 140.00;	
	}
	if(foodName == "Chicken Pepper Pizza"){
	   return 80.00;
	}
	if(foodName == "Tandoor Chicken Pizza Large"){
	   return 250.00;	
	}
	if(foodName == "Chicken 65 Pizza"){
	   return 280.00;
	}
	if(foodName == "Red Chicken"){
	   return 300.00;	
	}
	if(foodName == "Kabab"){
	   return 90.00;
	}
	if(foodName == "Chocolate Chicken"){
	   return 450.00;	
	}
	if(foodName == "Butter chicken Dry"){
	   return 120.00;
	}
	if(foodName == "Q Chicken"){
	   return 360.00;	
	}
	if(foodName == "Half Kabab"){
	   return 50.00;
	}
	if(foodName == "Dril Chicken"){
	   return 150.00;	
	}
	if(foodName == "Pepper"){
	   return 390.00;
	}
	if(foodName == "Butter Chicken"){
	   return 550.00;	
	}
	
    else{
		System.out.println(foodName+" Not found");
	}
	
	return 0.00;
  
  }

}