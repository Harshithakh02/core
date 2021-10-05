class ProgramPrint
{
  public static String name(String dream, String company)
  {
   System.out.println("Harshitha");
   System.out.println("Pleasure(Scooty)");
   System.out.println(dream);
   System.out.println(company);
   return dream+" "+company;
  }
  public static void companyname()
  {
	  System.out.println("Tech Mahindra");
	  System.out.println("Infosys");
	  System.out.println("Accenture");
	  System.out.println("IBM");
  }
  public static void computerbrands()
  {
	  System.out.println("Acer");
	  System.out.println("Dell");
	  System.out.println("Lenovo");
	  System.out.println("Sony");
	  System.out.println("Apple");
	  System.out.println("Asus");
  }
  public static String mobilebrands(String first)
  {
	  System.out.println(first);
	  System.out.println("Oppo");
	  System.out.println("Vivo");
      System.out.println("Redmi");
	  System.out.println("Nokia");
	  System.out.println("Oneplus");
	  System.out.println(" ");
	  return first;
  }
  public static String iplteams(String last)
  {
	  System.out.println("Royal Challengers Bangalore");
	  System.out.println("Chennai Super Kings");
	  System.out.println("Mumbai Indians");
	  System.out.println("Kolkata Knight Riders");
	  System.out.println("Rajasthan Royals");
	  System.out.println("Delhi Capitals");
	  System.out.println("Sunrisers Hyderbad");
	  System.out.println(last);
	  System.out.println(" ");
	  return last;
  }
  public static String mobile(String[] values, String first)
  {
	  String[] brands={first,"oppo","Vivo","Redmi"};
	  System.out.println(brands[0]);
     System.out.println(brands[1]);	 
	 System.out.println(brands[2]);
	 System.out.println(brands[3]);
	 System.out.println(" ");
	 return first;
  }
  public static String ipl(String[] values, String last)
  {
	String[] teams={"Royal Challengers Bangalore","Chennai Super Kings","Mumbai Indians","Kolkata Knight Riders","Rajasthan Royals","Delhi Capitals","Sunrisers Hyderbad",last};
    System.out.println(teams[0]);
    System.out.println(teams[1]);	 
	System.out.println(teams[2]);
	System.out.println(teams[3]);
    System.out.println(teams[4]);
    System.out.println(teams[5]);	 
	System.out.println(teams[6]);
	System.out.println(teams[7]);	
	System.out.println(" ");
	return last;
  }
}