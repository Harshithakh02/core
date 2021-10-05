class NailCutter
{
	String company;
	String color;
	float price;
	
	enum Online
	{
		FLIPKART,AMAZON,MYNTRA,NYKA;
	}
	
	Online onlineshoppingame;
	String DeliveryLocation;
	
	void cuttingnails()
	{
		System.out.println("invoked cuttingfingernails");
		System.out.println("Nailcutter Details:");
		System.out.println(company);
		System.out.println(color);
		System.out.println(price);
		System.out.println(onlineshoppingame);
		System.out.println(DeliveryLocation);
	}
	
	void cuttinghangnails()
	{
		System.out.println("invoked cuttinghangnails");
		System.out.println("Nailcutter Details:");
		System.out.println(company);
		System.out.println(color);
		System.out.println(price);
		System.out.println(onlineshoppingame);
		System.out.println(DeliveryLocation);
	}
	
	
}