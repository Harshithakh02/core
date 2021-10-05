class Grinder
{
	int capacityinltrs=2;
	String company="Butterfly";
	Motor motor=new Motor();
	
	Grinder(int capacity,String company)
	{
		this.capacityinltrs=capacityinltrs;
		this.company=company;
		System.out.println("invoked int and string const");
	}
}