class Jail
{
	String location;
	String name;
	int noofcells;
	int noofcriminals;
	int personnel;
	float areainacres;
	int yearofconstruction;
	boolean strict;
	Jail(String location,String name,int yearofconstruction)
	{
		this.location=location;
		this.name=name;
		this.yearofconstruction=yearofconstruction;
		noofcells=50;
		this.personnel=50;
		this.noofcriminals=100;
		this.areainacres=3;
		System.out.println("Created with string,string,int");
		System.out.println(this.noofcells==this.personnel);
	}
	Jail()
	{
		
	}
}