class NarthakiTheaterRunner
{
	public static void main(String[] movie)
	{
		Theater ref=new Theater("Narthaki",Ticketprice.BALCONY);
		ref.location="Majestic";
		System.out.println(ref.name);
		System.out.println(ref.location);
		System.out.println(ref.capacity);
		System.out.println(ref.ticketprice);
		System.out.println(ref.ticketprice.price);
		System.out.println(ref.ticketprice.tax);
		
		
	}
}