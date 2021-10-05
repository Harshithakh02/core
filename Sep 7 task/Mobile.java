class Mobile{
public static float totaldetailsofmobile(String brand,String color,String model,float price,int quantity,long imei,String country)
{
	System.out.println("Brand:"+brand);
	System.out.println("Color:"+color);
	System.out.println("Model:"+model);
	System.out.println("Price:"+price);
	System.out.println("Quantity:"+quantity);
	System.out.println("IMEI:"+imei);
	System.out.println("Country:"+country);
	float total=quantity*price;
    return total;	
}

}