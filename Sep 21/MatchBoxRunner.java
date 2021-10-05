class MatchBoxRunner
{
	public static void main(String[] bomb)
	{
		String brandname="Homelite";
		int noofsticks=30;
		MatchBox match =new MatchBox(brandname,noofsticks);
		System.out.println(match.brand);
		System.out.println(match.noofstick);
		System.out.println(match.empty);
		System.out.println(match.matchboxsize);
		match.matchboxsize=Size.MEDIUM;
		System.out.println(match.matchboxsize);		
	}
}