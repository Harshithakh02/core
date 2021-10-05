class ChocolateRunner
{
public static void main(String[] rainbow)
{
	Chocolate ref=new Chocolate();
	System.out.println(ref);
	String Name = ref.name;
	System.out.println(Name);
	float Price=ref.price;
	System.out.println(Price);
	
	/*Chocolate choco=new Chocolate();
    choco.name="Munch";
	String Name1=ref.name;
	System.out.println(Name1);
	choco.price=5;
	float Price1=ref.price;
	System.out.println(Price1);*/
	
	Chocolate melt=new Chocolate();
	String Name2=ref.name;
	System.out.println(Name2);
	float Price2=ref.price;
	System.out.println(Price2);
	
	Chocolate cadbaury=new Chocolate();
    ref.name="Munch";
	String Name3=ref.name;
	System.out.println(Name3);
	ref.price=5;
	float Price3=ref.price;
	System.out.println(Price3);
}
}