class WeaponRunner
{
	public static void main(String[] ring)
	{
	Weapon ref=new Weapon();
	System.out.println(ref.brand);
	System.out.println(ref.color);
	System.out.println(ref.price);
	System.out.println(ref.range);
	System.out.println(ref.type);
	System.out.println(ref.lengthinmm);
	
	String brand="AK47";
    String color="Brown";
    float price=18000f;
    int range=350;
    String type="Army";
    int lengthinmm=880;
	Weapon ref1=new Weapon(brand,color,price,range,type,lengthinmm);
	System.out.println(ref1.brand);
	System.out.println(ref1.color);
	System.out.println(ref1.price);
	System.out.println(ref1.range);
	System.out.println(ref1.type);
	System.out.println(ref1.lengthinmm);
	
	Weapon ref2=new Weapon("AK47","Brown",18000f);
	System.out.println(ref2.brand);
	System.out.println(ref2.color);
	System.out.println(ref2.price);
	
	Weapon ref3=new Weapon(350,"Army",880);
	System.out.println(ref1.range);
	System.out.println(ref1.type);
	System.out.println(ref1.lengthinmm);
	
	Weapon ref4=new Weapon("Black",350);
	System.out.println(ref2.color);
	System.out.println(ref1.range);
	
	Weapon ref5=new Weapon(20000f,800);
	System.out.println(ref2.price);
	System.out.println(ref1.lengthinmm);
	
	
	
	
	}	
}