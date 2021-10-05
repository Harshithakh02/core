class LaboratoryRunner
{
	public static void main(String[] rain)
	{
		String name="ECE Lab";
		String location="2nd Floor";
		int rooms=3;
		Laboratory lab=new Laboratory(name,location,rooms);
		System.out.println(lab.name);
		System.out.println(lab.location);
		System.out.println(lab.noofrooms);
		//System.out.println(lab.operatornames);
		System.out.println(lab.type);
		System.out.println("Before Changing");
		System.out.println(location==lab.location);
		lab.name="Embedded C Lab";
		System.out.println(lab.name);
		lab.location="3rd Floor";
		System.out.println("After Changing");
		System.out.println(location==lab.location);
		System.out.println(lab.location);
		lab.type=Labtype.ECE;
		System.out.println(lab.type);	
        //lab.operatornames={"Harshitha","Varshitha"};
		System.out.println(lab.operatornames[0]);
	}
}