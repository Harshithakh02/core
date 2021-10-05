class Medicine{
public static float gettotaldetailsofmedicine(String name, String company, float price, int quantity)
{
	System.out.println("Medicine Name:"+name);
	System.out.println("Company Name:"+company);
	System.out.println("Price:"+price);
    System.out.println("Quantity:"+quantity);	
	float total=quantity*price;
    return total;	
}

}