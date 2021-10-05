class Laboratory
{
	String name;
	String location;
	int noofrooms;
	String[] operatornames={"Harshitha","Varshitha"};
	enum Labtype
    {
     ECE,EEE,MEC,CIV,PHY,BIO,CHEM;
    }
	Labtype type;
	Laboratory(String name,String location,int noofrooms)
	{
		System.out.println("Invoked Const,String,String,Int types");
		this.name=name;
		this.location=location;
		this.noofrooms=noofrooms;	
	}
	Laboratory()
	{
		
	}
}