class Dog
{
	String waggingtail;
	
   static void waggingtail()
   {
	System.out.println("invoked waggingtail");
   }
   void eating()
   {
	   System.out.println("invoked eating");
	   this.waggingtail();
   }
   void barking()
   {
	   System.out.println(waggingtail);
   }
   static void fight()
   {
	   waggingtail();
   }
  
  public static void main(String[] bowbow)
  {
	  Dog swan=new Dog();
	  swan.waggingtail();
	  swan.eating();
	  swan.barking();
	  swan.fight();
  }
}