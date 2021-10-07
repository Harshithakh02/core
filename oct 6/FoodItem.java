class FoodItem
{
	String name;
	float price;
	String hotelName;
	int quantity;
	
	enum FoodType
	{
		BREAKFAST_MENU,BRUNCH_MENU,LUNCHEON_MENU,AFTERNOON_AND_HIGH_TEA_MENU,DINNER_MENU,SUPER_MENU,ROOM_SERVICE_MENU;
	}
	FoodType type;
	
	float ratingfor5;
	
	enum OrderType
    {	
		ONLINE,OFFLINE;
	}
	OrderType orderType;
	static float totalFoodItemsPrice;
	
	FoodItem(String name,float price,String hotelName,int quantity,FoodType type,float ratingfor5,OrderType orderType)
	{
		System.out.println("invoked 7 const");
		this.name=name;
		this.price=price;
		this.hotelName=hotelName;
		this.quantity=quantity;
		this.type=type;
		this.ratingfor5=ratingfor5;
		this.orderType=orderType;
	}
	
	FoodItem(String name,float price,int quantity,OrderType orderType)
	{
		System.out.println("invoked 4 const");
		this.name=name;
		this.price=price;
		this.quantity=quantity;
		this.orderType=orderType;
	}
	
	void displayDetails()
	{
		System.out.println("displaydetails is invoked");
		System.out.println(this.quantity);
		System.out.println(this.type);
		System.out.println(this.ratingfor5);
		System.out.println(this.orderType);
	}
	
	void printtotalprice()
	{
		float total=this.price*this.quantity;
		System.out.println(total);
		totalFoodItemsPrice=totalFoodItemsPrice+total;
	}
	
	static void printTotalFoodItemsPrice()
	{
		System.out.println("Total FoodItems Price:"+totalFoodItemsPrice);
	}
	
	void printHotelName()
	{
		System.out.println("invoked printHotelName");
		System.out.println(this.hotelName);
	}
	
	void printNameAndPrice()
	{
		System.out.println("invoked printNameAndPrice");
		System.out.println(this.name);
		System.out.println(this.price);
	}
}