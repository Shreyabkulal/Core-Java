class Dmart{

   static String chocolates[]={"Dairy Milk","Munch","Temptation","Kit Kat","Safari","Snickers"};
   static String groceryAndStaples[]={"Rice","Wheat flour (Atta)","Pulses (Lentils)","Sugar","Cooking oil"};
   static String dairyAndBakery[]={"Milk","Cheese","Yogurt","Bread","Butter"};
   static String beverages[]={"Soft drinks","Juices","Tea","Coffee","Bottled water"};
   static String snacksAndPackagedFoods[]={"Biscuits","Chips","Instant noodles","Chocolates","Breakfast cereals"};
   static String personalCare[]={"Shampoo","Toothpaste","Soap","Deodorant","Moisturizer"};
   static String householdSupplies[]={"Detergent","Dishwashing liquid","Cleaning sprays","Garbage bags","Toilet paper"};
   static String fruits[]={"Grapes","Apple","Banana","PineApple","Mango"};
   static String vegetables[]={"Carrot","Cucumber","Beetroot","Brinjal","Snake Guard"};
   static String frozenFoods[]={"Frozen peas","Frozen chicken nuggets","Ice cream","Frozen parathas","Frozen fish"};
   static String healthAndWellness[]={"Vitamins","Pain relievers","First aid supplies","Hand sanitizers","Face masks"};
   static String babyCare[]={"Diapers","Baby wipes","Baby food","Baby lotion","Baby shampoo"};
   static String homeAndKitchen[]={"Non-stick cookware","Kitchen utensils","Storage containers","Tableware (plates, bowls)","Kitchen towels"};
   static String stationery[]={"Notebooks","Pens","Markers","Envelopes"};
   static String clothing[]={"T-shirts","Socks","Casual shirts","Nightwear"};


  public static void main(String[] newCollection){
 
     System.out.println("chocolates are:"+chocolates.length);
	 //for(int index=0; index < chocolates.length; index++)
		// System.out.println(chocolates[index]);
	 
	 for (String chocolate: chocolates){
		 System.out.println(chocolate);
	 };
	 
	 System.out.println("\nGrocery And Staples are:");
	 for (String groceryAndStaple:groceryAndStaples){
		 System.out.println(groceryAndStaple);
	 };
	 
	 System.out.println("\nDairy And Bakery are:"+dairyAndBakery.length);
	 for(String dairyAndBakeryItem:dairyAndBakery){
		 System.out.println(dairyAndBakeryItem);
	 };

	 
	 System.out.println("\nBeverages are:"+beverages.length);
	 for(String beverage:beverages){
		 System.out.println(beverage);
	 };
	 
	 System.out.println("\nSnacks And Packaged Foods are:"+snacksAndPackagedFoods.length);
	 for (String snacksAndPackagedFood:snacksAndPackagedFoods){
		 System.out.println(snacksAndPackagedFood);
	 };
	 
	 System.out.println("\nPersonal Care are:"+personalCare.length);
	 for(String personalCares:personalCare){
		 System.out.println(personalCares);
	 };
	 
	 System.out.println("\nHousehold Supplies are:"+householdSupplies.length);
	 for(String householdSupply:householdSupplies){
		 System.out.println(householdSupply);
	 };
	 
	 System.out.println("\nFruits are:"+fruits.length);
	 for(String fruit:fruits){
		 System.out.println(fruit);		 
	 };
	 
	 System.out.println("\nVegetables are:"+vegetables.length);
	 for(String vegetable:vegetables){
		 System.out.println(vegetable);		 
	 };
	 
	 System.out.println("\nFrozen Foods are:"+frozenFoods.length);
	 for(String frozenFood:frozenFoods){
		 System.out.println(frozenFood);		 
	 };
	 
	 System.out.println("\nHealth And Wellness are:"+healthAndWellness.length);
	 for(String healthAndWell:healthAndWellness){
		 System.out.println(healthAndWell);		 
	 };
	 
	 System.out.println("\nBaby care are:"+babyCare.length);
	 for(String babyCares:babyCare){
		 System.out.println(babyCares);		 
	 };
	 
	 System.out.println("\nHome And Kitchen are:"+homeAndKitchen.length);
	 for(String homeAndKitchens:homeAndKitchen){
		 System.out.println(homeAndKitchens);		 
	 };
	 
	 System.out.println("\nStationery are:"+stationery.length);
	 for(String stationeryItem:stationery){
		 System.out.println(stationeryItem);
	 };
	 
	 System.out.println("\nClothing are:"+clothing.length);
	 for(String clothings:clothing){
		 System.out.println(clothings);
		 
	 };	 
   
   }

}
