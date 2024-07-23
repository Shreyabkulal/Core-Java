class BlinkIt{
	static double price;

  public static double takeOrder(String foodName){
  
    if(foodName == "Butter"){
	   return 40.00;	
	}
	if(foodName == "Chicken Sukka"){
	   return 170.00;
	}
	if(foodName == "Tandoor Chicken Half"){
	   return 140.00;	
	}
	if(foodName == "Chicken Pepper Dry"){
	   return 80.00;
	}
	if(foodName == "Green Chicken"){
	   return 250.00;	
	}
	if(foodName == "Chicken 65"){
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

public static double takeOrder(String foodName,int quantity){
  
    if(foodName == "Butter"){
	   price= 40.00 * quantity;	
	   return price;
	}
	if(foodName == "Chicken Sukka"){
	   price= 170.00* quantity;
	   return price;
	}
	if(foodName == "Tandoor Chicken Half"){
	   price= 140.00* quantity;
	   return price;	
	}
	if(foodName == "Chicken Pepper Dry"){
	   price= 80.00* quantity;
	   return price;
	}
	if(foodName == "Green Chicken"){
	   price= 250.00* quantity;
       return price;	   
	}
	if(foodName == "Chicken 65"){
	   price= 280.00* quantity;
	   return price;
	}
	if(foodName == "Red Chicken"){
	   price= 300.00* quantity;
       return price;	   
	}
	if(foodName == "Kabab"){
	   price= 90.00* quantity;
	   return price;
	}
	if(foodName == "Chocolate Chicken"){
	   price= 450.00* quantity;
       return price;	   
	}
	if(foodName == "Butter chicken Dry"){
	   price= 120.00* quantity;
	   return price;
	}
	if(foodName == "Q Chicken"){
	   price= 360.00* quantity;
       return price;	   
	}
	if(foodName == "Half Kabab"){
	   price= 50.00* quantity;
	   return price;
	}
	if(foodName == "Dril Chicken"){
	   price= 150.00* quantity;
       return price;	   
	}
	if(foodName == "Pepper"){
	   price= 390.00* quantity;
	   return price;
	}
	if(foodName == "Butter Chicken"){
	   price= 550.00* quantity;
       return price;	   
	}
	
    else{
		System.out.println(foodName+" Not found");
	}
	
	return price;
  
  }
}