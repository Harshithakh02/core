class RunnerPrint{
 public static void main(String[] values)
 {
  String full = ProgramPrint.name("Google","Company");
  System.out.println(full);
  System.out.println(" ");
  ProgramPrint.companyname();
  System.out.println(" ");
  ProgramPrint.computerbrands();
  System.out.println(" ");
  String firstname=ProgramPrint.mobilebrands("Samsung");
  System.out.println(firstname);
  System.out.println(" ");
  String lastname=ProgramPrint.iplteams("Punjab Kings");
  System.out.println(lastname);
  System.out.println(" ");
  String Firstname = ProgramPrint.mobile(values, "Samsung");
  System.out.println(Firstname);
  System.out.println(" ");
  String lastteam = ProgramPrint.ipl(values,"Punjab Kings");
  System.out.println(lastteam); 
  }
 }