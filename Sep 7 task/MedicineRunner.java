class MedicineRunner
{
public static void main(String[] medi)
{   
    String name=medi[0];
	String company=medi[1];
	String str1=medi[2];
	float price=Float.parseFloat(str1);
	String str = medi[3];
	int qt=Integer.parseInt(str);
	//int quantity=medi[2];
	//float price=medi[3];
	float total = Medicine.gettotaldetailsofmedicine(name,company,price,qt);
	System.out.println("Total Price:"+total);
	String nam=medi[4];
	String comp=medi[5];
	String str2=medi[6];
	float pri=Float.parseFloat(str2);
	String str3= medi[7];
	int qut=Integer.parseInt(str3);
	float totalprice = Medicine.gettotaldetailsofmedicine(nam,comp,pri,qut);
	System.out.println("Total Price:"+totalprice);
}
}