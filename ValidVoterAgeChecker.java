class ValidVoterAgeChecker{
 public static void main(String[] values)
 {
   int age=17;
   String name="Shubha";
   String area="BTM";
   if(age>=18)
   {
     System.out.println("Valid age");
	 System.out.println(name+" can vote");
   }
   else
   {
     System.out.println("Invalid age");
     System.out.println(name+" cannot vote");	 
   }
    String contestname=getcontestant(area);
	System.out.println(contestname);
	System.out.println("Voting Area:"+area);
 }
 public static String getcontestant(String area)
 {
   if(area=="BTM")
   {
     return "Harshitha";   
   }
   if(area=="Jayanagar")
   {
     return "Varshitha";
   }
   if(area=="Kormangala")
   {
    return "Vanaja";
   }
   return "No Match";
 }
 
}
 
 
 