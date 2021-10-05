class ReturnProgram
{
 public static void main(String[] val)
 {
  String temp=Temperature.getfeelingbytemperature(35);
  System.out.println(temp);
  String DOB= "11-07-1999";
  System.out.println("BirthDate:"+DOB);
  String DMY=BirthdayPerson.getpersonnamebydmy(11,07,1999);
  System.out.println(DMY);
  String Movie="Pailwaan";
  System.out.println("Movie Name:"+Movie);
  String moviename=MovieName.getactorsbymovie(Movie);
  //System.out.println(moviename);
 }
}