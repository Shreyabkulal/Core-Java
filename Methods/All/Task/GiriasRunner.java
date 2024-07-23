class GiriasRunner{
	
	public static void main(String[] home){
		System.out.println("main started");
		Girias.createhomeAppliance("Refrigerator");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Microwave Oven");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Washing Machine");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Dishwasher");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Air Conditioner");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Vacuum Cleaner");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Electric Kettle");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Toaster");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Blender");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Electric Iron");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance("Water Heater -Geyser");
		//Girias.getHomeAppliances();
		
		Girias.createhomeAppliance(null	);
		Girias.getHomeAppliances();
		Girias.updateHomeAppliance("Blender","Table");
		Girias.getHomeAppliances();
		System.out.println("main ended");
		
	}
}