class JailRunner
{
	public static void main(String[] color)
	{
		String location="Ballary";
		String name="Ballary Central Jail";
		int yearofconst=1872;
		Jail jail=new Jail(location,name,yearofconst);
		System.out.println(jail.location);
		System.out.println(jail.name);
		System.out.println(jail.yearofconstruction);
		System.out.println(jail.noofcells);
		System.out.println(jail.noofcriminals);
		System.out.println(jail.strict);
		System.out.println(jail.areainacres);
		System.out.println(location==jail.location);
		System.out.println(jail.noofcells==jail.personnel);
	}
}