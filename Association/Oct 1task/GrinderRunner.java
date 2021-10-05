class GrinderRunner
{
	public static void main(String[] args)
	{
	Grinder grind=new Grinder(2,"Butterfly");
	System.out.println(grind.capacityinltrs);
	System.out.println(grind.company);
	int capacityinltrs=grind.capacityinltrs;
	String company=grind.company;
	Motor motor=grind.motor;
	System.out.println(motor.model);
	System.out.println(motor.rpm);
	}
	
}