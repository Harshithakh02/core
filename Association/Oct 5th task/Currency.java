class Currency
{
	String name;
	Country country= new Country();
	int value;
	
	void displaydetails()
	{
		System.out.println(this.country);
		System.out.println(this.name);
		System.out.println(this.value);
	}
}



//Currency-name,country,value  displaydetails()