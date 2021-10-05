class BirthdayPerson
{
 public static String getpersonnamebydmy(int date, int month, int year)
 {
   System.out.println("Person Name based on Birthdate");
   if(date==11 && month==07 && year==1999)
   {
    System.out.println("Birthday Girl Vandana");
	return "Vandana";
   }
   if(date==19 && month==06 && year==1999)
   {
    System.out.println("Birthday Girl Monisha");
	return "Monisha";
   }
    if(date==24 && month==12 && year==1999)
   {
    System.out.println("Birthday Girl Harshitha");
	return "Harshitha";
   }
    if(date==07&& month==04 && year==1999)
   {
    System.out.println("Birthday Girl Soujanya");
	return "Soujanya";
   }
   return "No Match";
 }
 
}