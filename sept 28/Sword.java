class Sword
{
	String kathi;
	
   static void fighting()
   {
	System.out.println("invoked fighting");
   }
   void workingtogether()
   {
	   System.out.println("invoked workingtogether");
	   this.fighting();
   }
   void startfight()
   {
	   System.out.println(kathi);
   }
   static void stopfight()
   {
	   fighting();
   }
  
  public static void main(String[] chapati)
  {
	  Sword swan=new Sword();
	  swan.fighting();
	  swan.workingtogether();
	  swan.startfight();
	  swan.stopfight();
  }
}