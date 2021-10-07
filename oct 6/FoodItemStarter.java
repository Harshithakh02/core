class FoodItemStarter
{
	public static void main(String[] idlivada)
	{
		FoodItem foody=new FoodItem("Dosa",45,"Fab Hotel",1,FoodItem.FoodType.BREAKFAST_MENU,3.6f,FoodItem.OrderType.ONLINE);
		foody.displayDetails();
		foody.printHotelName();
		foody.printNameAndPrice();
		foody.printtotalprice();
		foody.printTotalFoodItemsPrice();
		
		System.out.println(" ");
		
		FoodItem foody1=new FoodItem("North Meals",70,"Gokul Hotel",2,FoodItem.FoodType.LUNCHEON_MENU,4.5f,FoodItem.OrderType.OFFLINE);
		foody1.displayDetails();
		foody1.printHotelName();
		foody1.printNameAndPrice();
		foody1.printtotalprice();
		foody1.printTotalFoodItemsPrice();
		
		System.out.println(" ");
		
		FoodItem foody2=new FoodItem("South Meals",100,3,FoodItem.OrderType.OFFLINE);
		foody2.displayDetails();
		//foody2.printHotelName();
		foody2.hotelName="Shubham Hotel";
		System.out.println(foody2.hotelName);
		foody2.printNameAndPrice();
		foody2.printtotalprice();
		foody2.printTotalFoodItemsPrice();
		
		
		
	}
}