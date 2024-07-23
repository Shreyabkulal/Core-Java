class TextilesRunner{

  public static void main (String[] a){
  System.out.println("main started");
  Textiles.addMaterial("Cotton");
  Textiles.addMaterial("Linen");
  Textiles.addMaterial("Silk");
  Textiles.addMaterial("Wool");
  Textiles.addMaterial("Polyester");
  Textiles.addMaterial("Nylon");
  Textiles.addMaterial("Acrylic");
  Textiles.addMaterial("Rayon");
  Textiles.addMaterial("Spandex");
  Textiles.addMaterial("Bamboo");
  Textiles.addMaterial("Hemp");
  Textiles.addMaterial("Cashmere");
  Textiles.addMaterial("Modal");
  Textiles.addMaterial("Tencel");
  
  Textiles.getAllMaterialInfo();
  
  Textiles.updateMaterial("Tencel","Lyocell");
  
  
  
  System.out.println("main ended");
  
  }
}