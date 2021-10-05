class CountryRunner
{
public static void main(String[] serious)
{
       String name="India";
	int noofstates=28;
	String primeminister="Narendra Modi";
	String presidentwife="Savita Kovind";
	Country ref = new Country(name,noofstates,primeminister,presidentwife);
	System.out.println(ref.name);
	System.out.println(ref.noofstates);
	System.out.println(ref.primeminister);
	System.out.println(ref.presidentwife);
}
}