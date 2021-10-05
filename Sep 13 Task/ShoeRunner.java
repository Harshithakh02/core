class ShoeRunner
{
public static void main(String[] rainbow)
{
	Shoe ref=new Shoe();
	String company = ref.company;
	System.out.println(company);
	int pair = ref.pair;
	System.out.println(pair);
	float price=ref.price;
	System.out.println(price);
	
	System.out.println(" ");
	
	Shoe ref1=new Shoe();
	String company1 = ref1.company;
	System.out.println(company1);
	int pair1 = ref1.pair;
	System.out.println(pair1);
	float price1=ref.price;
	System.out.println(price1);
}
}