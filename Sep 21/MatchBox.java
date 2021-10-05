class MatchBox
{
	String brand;
	int noofstick;
	boolean empty;
	Size matchboxsize;
	MatchBox(String brand,int noofstick)
	{
		System.out.println("Invoked const..String,int");
		this.brand=brand;
		this.noofstick=noofstick;
		this.empty=true;
	}
	MatchBox()
	{
		
	}
}