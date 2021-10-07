class Product
{
	String name;
	String type;
	float price;
	int quantity;
	String vendor;
	static float totalProductCost;
	
	Product(String name,String type,float price,int quantity,String vendor)
	{
		System.out.println("invoked 5 const");
		this.name=name;
		this.type=type;
		this.price=price;
		this.quantity=quantity;
		this.vendor=vendor;
	}

    Product(String name,float price,int quantity)
	{
		System.out.println("invoked 3 const");
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}	
	
	void displaydetails()
	{
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.price);
		System.out.println(this.quantity);
		System.out.println(this.vendor);
	}
	
	void printtotalcost()
	{
		float total=this.price*this.quantity;
		System.out.println(total);
		totalProductCost=totalProductCost+total;
	}
	
	static void printTotalProductCost()
	{
		System.out.println("Total Products Price:"+totalProductCost);
	}
}