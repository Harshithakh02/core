class GasCylinder
{
	CompanyName company;
	float price;
	float weightinkg;
	String cylinderno;
	GascylinderSize size;
	 GasCylinder(float price,float weightinkg,String cylinderno)
	 {
		 System.out.println("Invoked const..float,float,String");
		 this.price=price;
		 this.weightinkg=weightinkg;
		 this.cylinderno=cylinderno;
	 }
}