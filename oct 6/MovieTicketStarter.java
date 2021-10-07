class MovieTicketStarter
{
	public static void main(String[] stars)
	{
		MovieTicket ref = new MovieTicket("Kotigobba 3","Siddeshwara Theater",150f,5,"Balcony");
		ref.displaydetails();
		ref.printTotalPrice();
		System.out.println(" ");
		MovieTicket ref1 = new MovieTicket("Love Story","Narthaki Theater",150f,2,"Balcony");
		ref1.displaydetails();
		ref1.printTotalPrice();

      		
	}
}