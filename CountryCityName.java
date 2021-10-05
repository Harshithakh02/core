class CountryCityName
{
public static void main(String[] many)
{
 int code = 91;
 System.out.println("Pincode no="+code);
 String name = CountryCity.getcountrybypincode(code);
 System.out.println(name);
 int pin=574240;
 System.out.println("Pincode nr:"+pin);
 String City = CountryCity.getcitybypincode(pin);
 System.out.println(City);
  
}
}