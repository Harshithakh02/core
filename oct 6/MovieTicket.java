class MovieTicket
{
	String movieName;
	String theater;
	float price;
	int noofseats;
	String type;
	
	MovieTicket(String movieName,String theater,float price,int noofseats,String type)
	{
		this.movieName=movieName;
		this.theater=theater;
		this.price=price;
		this.noofseats=noofseats;
		this.type=type;
		System.out.println("invoked 5 const");
	}
	
	MovieTicket(String movieName,float price,int noofseats)
	{
		this.movieName=movieName;
		this.price=price;
		this.noofseats=noofseats;
		System.out.println("invoked 3 const");
	}
	
	void displaydetails()
	{
		System.out.println("displaydetails invoked");
		System.out.println(this.movieName);
		System.out.println(this.theater);
		System.out.println(this.price);
		System.out.println(this.noofseats);
		System.out.println(this.type);		
	}
	
	void printTotalPrice()
	{
		float total=this.price*this.noofseats;
		System.out.println(total);
	}
}