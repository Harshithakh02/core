class Temperature{
  public static String getfeelingbytemperature(float temp)
  {
	  System .out.println("Feelings based on Temperature");
   if(temp>10 && temp<=-30)
   {
    System.out.println("Temperature is Freezer");
	return "Freezer";
   }
   if(temp>0 && temp<=-10)
   {
	System.out.println("Ice");
	return "Ice";
   }
    if(temp>0 && temp<=10)
   {
	System.out.println("Temperature is cold");
	return "cold";
   }
    if(temp==15)
   {
	System.out.println("Temperature is cool");
	return"cool";
   }
    if(temp>20 && temp<30)
   {
	System.out.println("Temperature is Warm");
	return "Warm";
   }
    if(temp>30 && temp<40)
   {
	System.out.println("Temperature is hot");
	return"Hot";
   }
    if(temp==37)
   {
	System.out.println("Body Temp");
	return "Body Temperature";
   }
    if(temp>40 && temp<90)
   {
	System.out.println("Temperature is Too Hot");
	return"To Hot";
   }
    if(temp==100)
   {
	System.out.println("Water boils Temperature");
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
return "Invalid Temp";
  }
}