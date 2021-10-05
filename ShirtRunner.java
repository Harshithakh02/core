class ShirtRunner
{
	public static void main(String[] dress)
	{
		String shirtcolor=Shirt.color;
		System.out.println(shirtcolor);
		Shirt.changecolor();
		shirtcolor=Shirt.color;
		System.out.println(shirtcolor);
		Shirt.printcolor();
	}
}