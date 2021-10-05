class KeyboardRunner
{
	public static void main(String[] gubbi)
	{
		String color="Black";
		String wireornot="with wire";
		float price=260;
		Keyboard key=new Keyboard(color,wireornot,price);
		System.out.println(key.color);
		System.out.println(key.wiredornot);
		System.out.println(key.price);
		color="Siver";
		wireornot="with wire";
		price=260;
		Keyboard key1=new Keyboard(color,wireornot,price);
		System.out.println(key1.color);
		System.out.println(key1.wiredornot);
		System.out.println(key1.price);
		
	}
}