class HospitalRunner
{
 public static void main(String[] gogo)
 {
	String name="Coulmbia Asia";
	String location="Bangalore";
	String owner="Dr Nandkumar Jairam";
	int noofbeds=90;
	Hospital ref= new Hospital(name,location,owner,noofbeds);
	System.out.println(ref.name);
	System.out.println(ref.location);
	System.out.println(ref.owner);
	System.out.println(ref.noofbeds);
 }
}