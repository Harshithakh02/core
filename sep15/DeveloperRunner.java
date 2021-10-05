class DeveloperRunner
{
	public static void main(String[] develop)
	{
	String name="Shubha";
	String designation="Java Developer";
	float salary=4.5f;
	int totalexp=2;
	Developer ref=new Developer(name,designation,salary,totalexp);
	System.out.println(ref.name);
	System.out.println(ref.designation);
	System.out.println(ref.salary+"Lakhs");
	System.out.println(ref.totalexp+"years");
	}
}