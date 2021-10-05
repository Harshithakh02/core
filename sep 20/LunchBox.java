class LunchBox
{
	String name;
	String material;
	float price;
	int capacity;
	int noofcontainers;
	LunchBox(String name,String material,int noofcontainers)
	{
		this.name=name;
		this.material=material;
		this.noofcontainers=noofcontainers;
		this.capacity=1300;
		this.price=290f;
		System.out.println("Created with String,String,int");
		System.out.println(this.capacity==this.noofcontainers);
	}
	LunchBox()
	{
		
	}
}