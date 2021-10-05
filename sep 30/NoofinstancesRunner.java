class NoofinstancesRunner
{
	public static void main(String[] args)
	{
		System.out.println(NoofInstances.songname);
		NoofInstances inst1=new NoofInstances("Amar");
		NoofInstances ins2=new NoofInstances();
		NoofInstances ins3=new NoofInstances();
		System.out.println("Number of Instances Created:"+NoofInstances.count);
	}
}