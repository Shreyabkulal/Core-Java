class ChatShopRunner{

public static void main(String[] chat){

   System.out.println("main started");
   
    boolean chats=ChatShop.createChatName("pani Puri");
	boolean pricee1=ChatShop.addChatPrice(30.00);
	boolean pricee2=ChatShop.addChatPrice(35.00);
	boolean pricee3=ChatShop.addChatPrice(40.00);
	boolean pricee4=ChatShop.addChatPrice(20.00);
	boolean pricee5=ChatShop.addChatPrice(45.00);
	boolean pricee6=ChatShop.addChatPrice(25.00);
    
   
   System.out.println("chat names"+ChatShop.createChatName("Dahi Puri"));
   
   
   System.out.println("chat names"+ChatShop.createChatName("Masala Puri"));
   System.out.println("chat names"+ChatShop.createChatName("sav puri"));
   
   System.out.println("chat names"+ChatShop.createChatName("puri"));
   boolean bhel=ChatShop.createChatName("Bhel Puri");  
   System.out.println("chat names"+bhel);
   ChatShop.getChatNames();
   ChatShop.getChatPrice();

   
   boolean chatss= ChatShop.updateChatName("pani Puri","samosa");
   ChatShop.getChatNames();
   ChatShop.deleteChatName("Masala Puri");
   ChatShop.getChatNames();
   
   System.out.println("chat names"+ChatShop.createChatName("tikki Puri"));
   
   
   
   
   
   System.out.println("main ended");
 }
}