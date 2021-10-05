class MobileRunner
{
	public static void main(String[] mob)
	{
	String brand=mob[0];
	String color=mob[1];
	String model=mob[2];
	String str=mob[3];
	float price=Float.parseFloat(str);
	String str1= mob[4];
	int qt=Integer.parseInt(str1);
	String S=mob[5];
	long im=Long.parseLong(S);
	String country=mob[6];
	float total = Mobile.totaldetailsofmobile(brand,color,model,price,qt,im,country);
	System.out.println("Total Price:"+total);
	}
	
}