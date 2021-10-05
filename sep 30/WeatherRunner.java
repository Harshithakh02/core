class WeatherRunner
{
	public static void main(String[] args)
	{
		System.out.println(Weather.location);
		System.out.println(Weather.state);
		Weather we=new Weather("India",23f);
		//System.out.println(we.location);
		//System.out.println(we.state);
		we.time=11.39f;
	}
}