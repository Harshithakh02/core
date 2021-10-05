class MovieName
{
 public static String getactorsbymovie(String movie)
 {
   System.out.println("Actors based on Movie name");
   if(movie=="Pailwaan")
   {
	  String[] Pailwaan= {"Kichcha Sudeepa","Suniel Shetty","Aakanksha Singh","Sharath Lohitashwa", "Kabir Duhan Singh","Avinash"};
	  System.out.println("Actors:"+Pailwaan[0]+","+Pailwaan[1]+","+Pailwaan[2]+","+Pailwaan[3]+","+Pailwaan[4]+","+Pailwaan[5]);
	  return "Pailwaan";
   }
     if(movie=="LoveMocktail")
   {
	   String[] actors2={"Darling Krishna","Milana Nagaraj","AmruthaIyengar","Rachana inder","Abhilaash,Khushi"};
	   System.out.println("Actors:"+actors2[0]+","+actors2[1]+","+actors2[2]+","+actors2[3]+","+actors2[4]);
	   return "actors2";
   }
   if(movie=="Dia")
   {
	   String[] actors3= {"Pruthvi Ambaar","Dheekshith Shetty","Khushi","Pavitra Lokesh"};
	   System.out.println("Actors:"+actors3[0]+","+actors3[1]+","+actors3[2]+","+actors3[3]);
	   return "actors3";
   }
   
   return "No match";
 }
 
}