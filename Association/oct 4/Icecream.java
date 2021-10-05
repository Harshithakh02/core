class Icecream
{
	String flavour="Double Chocolate"; //literals
	
	enum Color
{
	WHITE,BROWN,PINK,YELLOW,ORANGE,BLACK,VIOLET,GREEN;
}

	Color color=Color.BROWN; //literals
	String type; //const
	float temp; //ref
	
	class Brand
{
	String name;
	String ownername;
	String location="Blr";
	int since;
	
	Brand(String name,String ownername)
	{
		this.name=name;
		this.ownername=ownername;
	}
	
	Brand()
	{
		
	}
}

	Brand brand; //ref
	
	Icecream(float temp)
	{
		this.temp=temp;
	}
	Icecream(float temp,String flavour,Color color)
	{
		this(temp);
		this.flavour=flavour;
		this.color=color;
	}
	
	public static void main(String[] chocochips)
	{
		Icecream cream;
		cream=new Icecream(-20,"Butterscotch",Color.YELLOW);
		System.out.println(cream.temp);
		System.out.println(cream.flavour);
		System.out.println(cream.color);
		System.out.println(cream.type);
		System.out.println(cream.brand);
		//cream.type="Cone";
		//System.out.println(cream.type);
		cream.Brand();
		//System.out.println(brand.name);
	}
}