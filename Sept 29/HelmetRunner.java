class HelmetRunner
{
public static void main(String[] mine)
	{
		Helmet hel=new Helmet();
		hel.company="Studds";
		hel.color="Black";
		hel.price=400.0f;
		hel.type=Helmet.Typesofhelmets.FULL_FACE_HELMET;
		hel.bikename="Hero Hond";
		
		Helmet hels=new Helmet();
		hels.company="Vega";
		hels.color="Green";
		hels.price=500.0f;
		hels.type=Helmet.Typesofhelmets.DUAL_SPORT_HELMET;
		hels.bikename="Pulsur";
		
		Helmet hel2=new Helmet();
		hel2.company="Royal Enfield";
		hel2.color="Black";
		hel2.price=600.0f;
		hel2.type=Helmet.Typesofhelmets.MODULAR_HELMET;
		hel2.bikename="Royal Enfield";
	
		hel.avoidinjury();
		hels.weatherprotection();
		hel2.weatherprotection();
	}
}