class CountryCity{
 public static String getcountrybypincode(int no)
 {
	
   System.out.println("invoked country by pincode");
   if(no==91)
   {
	  System.out.println("Country is India");
      return "India";	  
   }
   if(no==010)
   {
	  System.out.println("Country is South Korea");
      return "South Korea";	  
   }
   if(no==01)
   {
	  System.out.println("Country is Canada");
      return "Canada";	  
   }
 return "No Match";
 }
public static String getcitybypincode(int nr)
 {
	
   System.out.println("invoked city by pincode");
   if(nr==577201)
   {
	  System.out.println("City is Shimoga");
      return "Shimoga";
   }
   if(nr==574240)
   {
	  System.out.println("City is Ujire");
      return "Ujire";
   }
   if(nr==570001)
   {
	  System.out.println("City is Mysore");
      return "Mysore";
   }
 return "NA";
 }

}