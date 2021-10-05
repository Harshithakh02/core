class GasCylinderRunner
{
	public static void main(String[] red)
	{
	float gascyprice=887.50f;
	float gascyweightinkg=14.2f;
	String gascylinderno="A-11";
	GasCylinder gas=new GasCylinder(gascyprice,gascyweightinkg,gascylinderno);
	System.out.println(gas.company);
	System.out.println(gas.price);
    System.out.println(gas.weightinkg);
    System.out.println(gas.cylinderno);	
	System.out.println(gas.size);
	gas.company=CompanyName.INDANE;
	System.out.println(gas.company);
	}
}