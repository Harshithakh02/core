class Ipod
{
	String name;
	int generation;
	int ipodGB;
	float price;
	enum IpodModel
	{
		IPOD_TOUCH,IPOD_NANO,IPOD_SHUFFLE,IPOD_MINI,IPOD_CLASSIC;
	}
	IpodModel ipodmodel;
	enum IpodColor
	{
		BLUE,YELLOW,PINK,WHITE,BLACK,RED,SILVER;
	}
	IpodColor ipodcolor;
	
	void webbrowsingdevice()
	{
		System.out.println("Invoked webbrowsingdevice");
		System.out.println("Ipod Details:");
		System.out.println(name);
		System.out.println(generation);
		System.out.println(ipodGB);
		System.out.println(price);
		System.out.println(ipodmodel);
		System.out.println(ipodcolor);
	}
	void playdigitalmusic()
	{
		System.out.println("Invoked playdigitalmusic");
		System.out.println("Ipod Details:");
		System.out.println(name);
		System.out.println(generation);
		System.out.println(ipodGB);
		System.out.println(price);
		System.out.println(ipodmodel);
		System.out.println(ipodcolor);
	}
	
}