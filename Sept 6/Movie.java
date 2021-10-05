class Movie{
public static String[] getActorsbyMoviename(String moviename)
{
	System.out.println("invoked getActorsbyMoviename, arg passed"+moviename);
	if(moviename.equals("KGF"))
	{
		System.out.println("KGF is matched");
		String hero="Yash";
		String heroin="Srinidhi";
		String narrator="Ananthnag";
		String[] actors={hero,heroin,narrator};
		return actors;
	}
	else
	{
		System.out.println("Movie is not KGF");
	}
	return null;
}
}