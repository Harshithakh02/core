class ProductRunner
{
	public static void main(String[] rowa)
	{
		Product pros=new Product("Samsung M51","Electronic Gadgets",26500f,1,"Sangeetha");
		pros.displaydetails();
		pros.printtotalcost();
		pros.printTotalProductCost();
		
		Product pros1=new Product("Hair Dryer","Ec",1800,2,"Philips");
		pros1.displaydetails();
		pros1.printtotalcost();
		pros1.printTotalProductCost();
	}
}