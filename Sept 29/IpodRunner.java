class IpodRunner
{
public static void main(String[] songs)
	{
		Ipod wow=new Ipod();
		wow.name="Apple ipod";
		wow.generation=7;
		wow.ipodGB=256;
        wow.price=38900f;
		wow.ipodmodel=Ipod.IpodModel.IPOD_TOUCH;
		wow.ipodcolor=Ipod.IpodColor.BLUE;
		
		Ipod wow1=new Ipod();
		wow1.name="Apple ipod";
		wow1.generation=5;
		wow.ipodGB=32;
        wow1.price=29600f;
		wow1.ipodmodel=Ipod.IpodModel.IPOD_NANO;
		wow1.ipodcolor=Ipod.IpodColor.BLACK;
		
		Ipod wow2=new Ipod();
		wow2.name="Apple ipod";
		wow2.generation=6;
		wow.ipodGB=16;
        wow2.price=15899f;
		wow2.ipodmodel=Ipod.IpodModel.IPOD_SHUFFLE;
		wow2.ipodcolor=Ipod.IpodColor.RED;
		
		wow.webbrowsingdevice();
		wow1.webbrowsingdevice();
		wow2.playdigitalmusic();
	}
}