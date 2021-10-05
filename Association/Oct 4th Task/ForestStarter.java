class ForestStarter
{
	public static void main(String[] subbi)
	{
		Forest fore=new Forest("Bandipur","Chamrajanagar");
		//System.out.println(fore.name);
		System.out.println(fore.location);
		System.out.println(fore.reserved);
		System.out.println(fore.state);
		fore.state=new State("Basavaraj Bommai");
		System.out.println(fore.state.name);
		System.out.println(fore.state.noofdistricts);
		System.out.println(fore.state.cmName);
		System.out.println(fore.state.capitalcity);
		fore.state.capitalcity=new CapitalCity();
		System.out.println(fore.state.capitalcity.name);
		System.out.println(fore.state.capitalcity.population);
		System.out.println(fore.state.capitalcity.famousfor);
		
		
		//fore.state=new State("Basavaraj Bommai",capitalcity.name);
		
		//System.out.println(fore.state.capitalcity);
		
		
		
	}
}