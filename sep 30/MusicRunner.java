class MusicRunner
{
	public static void main(String[] args)
	{
		System.out.println(Music.songname);
		Music ears=new Music("Amar","Kaviraj");
		//System.out.println(ears.songname);
		ears.releaseyear=2019;
		System.out.println(ears.releaseyear);
	}
}