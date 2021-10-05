class TheaterRunner
{
	public static void main(String[] movie)
	{
		Ticketprice tp=Ticketprice.BOX;
		System.out.println(tp);
		System.out.println(tp.price);
		System.out.println(tp.tax);
		//System.out.println(Theater.capacity);
		
		Theater ref=new Theater();
		System.out.println(ref.capacity);

	    
        Ticketprice btp=Ticketprice.GANDHI;
		System.out.println(btp.price);
		System.out.println(btp.tax);
		//System.out.println(Ticketprice.MIDDLE.price+Ticketprice.MIDDLE.tax);
		
		
		Ticketprice[] ticketpricevalues=Ticketprice.values();
		for(int size=0;size<ticketpricevalues.length;)
		{
			Ticketprice temp=ticketpricevalues[size];
			System.out.println(temp);
            size++;
		}
		
	}
}