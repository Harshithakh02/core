class NailcutterRunner
{
public static void main(String[] sweets)
	{
		NailCutter nails=new NailCutter();
		nails.company="Cuteably";
		nails.color="White";
		nails.price=232.0f;
		nails.onlineshoppingame=NailCutter.Online.AMAZON;
		nails.DeliveryLocation="BTM 1st Stage";
		
		NailCutter nails1=new NailCutter();
		nails1.company="Bell orginal";
		nails1.color="Silver";
		nails1.price=99.0f;
		nails1.onlineshoppingame=NailCutter.Online.FLIPKART;
		nails1.DeliveryLocation="Yashwanthpur";
		
		NailCutter nails2=new NailCutter();
		nails2.company="iSweven";
		nails2.color="Black";
		nails2.price=659.0f;
		nails2.onlineshoppingame=NailCutter.Online.MYNTRA;
		nails2.DeliveryLocation="JP Nagar";
		
		nails.cuttingnails();
		nails1.cuttinghangnails();
		nails2.cuttinghangnails();
		
		
	}
}