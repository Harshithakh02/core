class Application
{
	String name;
	float version;
	Company company=new Company();
	
	void displaydetails()
	{
		System.out.println(this.name);
		System.out.println(this.version);
		System.out.println(this.company);
		
	}
	
}





//application-name,version,company,displaydetails()