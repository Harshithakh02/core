class Saloon
{
	String name;
	String location;
	float opentime;
	float closetime;
	SaloonBranch branch;
	
	void haircut()
	{
		System.out.println("invoked haircut");
		System.out.println("Saloon Details:");
		System.out.println(name);
		System.out.println(location);
		System.out.println(opentime);
		System.out.println(closetime);
		System.out.println(branch);	
	}
}