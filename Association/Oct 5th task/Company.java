class Company
{
  String name="Oracle";//Microsoft
  Country country=new Country();
  String ceo="Shailender Kumar";//Satya Nadella
  String cfo="Makarand Padalkar";
  
  void displaydetails()
  {
	System.out.println(this.name);
	System.out.println(this.country);
	System.out.println(this.ceo);
	System.out.println(this.cfo);
  }
}


//company-name,country,ceo,cfo,displaydetails()