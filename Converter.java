class Converter
{
	public static void main(String[] cone)
	{
		String acre="2.2";
		double wrappedacre=Double.parseDouble(acre);
		System.out.println(wrappedacre);
		String rupees="10";
		double wrappedrupees=Double.parseDouble(rupees);
		System.out.println(wrappedrupees);
		float mangoprice=50;
		Float wrappedmangoprice=Float.valueOf(mangoprice);
		System.out.println(wrappedmangoprice);
		String gender="F";
		char wrappergender=gender.charAt(0);
	}
}