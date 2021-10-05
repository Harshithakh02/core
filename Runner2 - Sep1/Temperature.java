class Temperature{
  public static string main(float temp)
  {
   if(temp>10 && temp<=-30)
   {
    System.out.println("Freezer");
	return "Freezer";
   }
   if(temp>0 && temp<=-10)
   {
	System.out.println("Ice");
	return "Ice";
   }
    if(temp>0 && temp<=10)
   {
	System.out.println("cold");
	return "cold";
   }
    if(temp==15)
   {
	System.out.println("cool");
	return"cool";
   }
    if(temp>20 && temp<30)
   {
	System.out.println("IWarm");
	return "Warm";
   }
    if(temp>30 && temp<40)
   {
	System.out.println("hot");
	return"Hot";
   }
    if(temp=37)
   {
	System.out.println("Body Temp");
	return "Body Temperature";
   }
    if(temp>40 && temp<90)
   {
	System.out.println("Too Hot");
	return"To Hot";
   }
    if(temp=100)
   {
	System.out.println("Water boils");
	return "Water Boils";
   }
    if(temp==1000)
   {
	System.out.println("Lava from a volcano");
	return "Lava from a volcano";
   }
    if(temp==1535)
   {
	System.out.println("Melting Point");
	return"Melting Point";
   }
  }
return"Invalid Temp";

}