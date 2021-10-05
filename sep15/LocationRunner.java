class LocationRunner
{
public static void main(String[] chocopie)
{
    String name="Gudavi Bird Sanctuary,Shimoga";
	String state="Karnataka";
	String famousfor="Bird Sanctuaries,Heaven for avid bird watchers";
	String besttimetovisit="July to October";
	Location ref=new Location(name,state,famousfor,besttimetovisit);
	System.out.println(ref.name);
	System.out.println(ref.state);
	System.out.println(ref.famousfor);
	System.out.println(ref.besttimetovisit);
}
}