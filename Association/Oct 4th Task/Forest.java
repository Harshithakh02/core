class Forest
{
	String name="Bandipur";//literal
	String location="Chamrajanagar"; 
	String reserved; 
	State state;
	
	Forest(String location,String reserved)
	{
		this.location=location;
		this.reserved=reserved;
	}
	Forest(String name,String location,String reserved)
	{
		this(location,reserved);
		this.name=name;	
	}
}