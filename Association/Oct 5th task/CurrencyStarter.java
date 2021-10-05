class CurrencyStarter
{
	public static void main(String[] nagini)
	{
	Currency cur=new Currency();
	cur.name="Rupee";
	cur.value=1;
	cur.displaydetails();
	cur.country.displaydetails();
	Application app=new Application();
	app.name="Java";
	app.version=1.8f;
	//app.company=new Company();
	//app.company.name="Microft";
	//app.company.ceo="Satya Nadella";
	//app.company=new Company();
	//app.company.name="Infosys";
	app.displaydetails();
	app.company.displaydetails();
	app.company.country.name="Switzerland";
	app.company.country.code=41;
	app.company.country.displaydetails();
	
	}
}

//Currency-name,country,value  displaydetails()
//Country -name,code,displaydetails()
//application-name,version,company,displaydetails()
//company-name,country,ceo,cfo,displaydetails()