class IcecreamStarter
{
	public static void main(String[] chocochips)
	{
		Icecream cream;
		cream=new Icecream(-20,"Butterscotch",Color.YELLOW);
		System.out.println(cream.temp);
		System.out.println(cream.flavour);
		System.out.println(cream.color);
		System.out.println(cream.type);
		System.out.println(cream.brand);
		cream.type="Cone";
		System.out.println(cream.type);
		cream.brand=new Brand();
		System.out.println(cream.brand);
		/*System.out.println(cream);
		
		//get flavour from icecream and store it using var
		String fla =cream.flavour;
		System.out.println(fla);
		
		float temp=cream.temp;
		Brand brand=cream.brand;
		String name=brand.name;
		String location=brand.location;
		String oname=brand.ownername;
		int since=brand.since;
		System.out.println(name);
		System.out.println(location);
		System.out.println(oname);
		System.out.println(since);
		brand.name="Lassi Spot";
	    brand.ownername="ABC";
		brand.since=2000;
		System.out.println(name);
		System.out.println(location);
		System.out.println(oname);
		System.out.println(since);
		System.out.println(" ");
		System.out.println(brand.name);
		System.out.println(brand.ownername);
		System.out.println(brand.since);
		System.out.println(brand.location);
		
		cream.brand.name=null;
		System.out.println(brand.name);
		cream.brand=null;
		System.out.println(cream.brand);
		//System.out.println(cream.brand.location);
		System.out.println(brand.location);*/
		
	}
}