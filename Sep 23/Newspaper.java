class Newspaper
{
	String name;
	String ownername;
	enum LanguageName
	{
		KANNADA(2,"DAILY"),ENGLISH(3,"WEEKLY ONCE"),HINDI(4,"MONTHLY ONCE");
		int price;
		String type;
		LanguageName(int price,String type)
		{
			this.price=price;
			this.type=type;
		}
	}
	LanguageName language;
	String editor = "Rakesh";
	
	Newspaper(String name,String ownername,LanguageName language)
	{
		this.name=name;
		this.ownername=ownername;
		this.language=language;
	}
	


	public static void main(String[] news)
	{
		Newspaper ref=new Newspaper("Vijaya Karntaka","Virat",LanguageName.KANNADA);
		System.out.println(ref.name);
		System.out.println(ref.ownername);
		System.out.println(ref.language);
		System.out.println(LanguageName.KANNADA.price);
		System.out.println(LanguageName.KANNADA.type);
		System.out.println(ref.editor);
		
		LanguageName[] languagevalues=LanguageName.values();
		for(int size=0;size<languagevalues.length;)
		{
			LanguageName temp=languagevalues[size];
			System.out.println(temp);
			System.out.println(temp.price);
			size++;
		}
		
	}
}