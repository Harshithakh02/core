class Helmet
{
	String company;
	float price;
	String color;
	enum Typesofhelmets
	{
		FULL_FACE_HELMET,HALF_FACE_HELMET,MODULAR_HELMET,HALF_SHELL_HELMET,OFF_ROAD_HELMETS,DUAL_SPORT_HELMET;
	}
	Typesofhelmets type;
	String bikename;
	void avoidinjury()
	{
	 System.out.println("Invoked avoidinjury");
	 System.out.println("Helmet Details:");
     System.out.println(company);
     System.out.println(price);
     System.out.println(color);
     System.out.println(type);
     System.out.println(bikename);	 
	}
	
	void weatherprotection()
	{
	 System.out.println("Invoked weatherprotection");
	 System.out.println("Helmet Details:");
     System.out.println(company);
     System.out.println(price);
     System.out.println(color);
     System.out.println(type);
     System.out.println(bikename);	
	}
}