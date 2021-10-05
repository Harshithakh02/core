class Weapon
{
 String brand;
 String color;
 float price;
 int range;
 String type;
 int lengthinmm;
 Weapon()
 {
	 System.out.println("Invoked default constructor");
 }
 Weapon(String brand,String color,float price,int range,String type,int lengthinmm)
 {
	 System.out.println("Invoked Parametarized constructor");
	 this.brand=brand;
	 this.color=color;
	 this.price=price;
	 this.range=range;
	 this.type=type;
	 this.lengthinmm=lengthinmm;
 }
 Weapon(String brand,String color,float price)
 {
	 System.out.println("Invoked Parametarized constructor");
	 this.brand=brand;
	 this.color=color;
	 this.price=price;
 }
 Weapon(int range,String type,int lengthinmm)
 {
	 System.out.println("Invoked Parametarized constructor");
	 this.range=range;
	 this.type=type;
	 this.lengthinmm=lengthinmm;
 }
 Weapon(String color,int range)
 {
	 System.out.println("Invoked Parametarized constructor");
	 this.color=color;
	 this.range=range;
 }
 Weapon(float price,int lengthinmm)
 {
	 System.out.println("Invoked Parametarized constructor");
	 this.price=price;
	 this.lengthinmm=lengthinmm;
 }
}