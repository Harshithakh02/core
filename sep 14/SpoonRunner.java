class SpoonRunner
{
	public static void main(String[] puche)
	{
		Spoon ref=new Spoon();
		System.out.println(ref.material);
		System.out.println(ref.color);
		System.out.println(ref.size);
		System.out.println(" ");
		Spoon ref1=new Spoon();
		ref1.material="Plastic";
		ref1.color="Red";
		ref1.size='L';
		System.out.println(ref1.material);
		System.out.println(ref1.color);
		System.out.println(ref1.size);
		System.out.println(" ");
		Spoon ref2=new Spoon();
		ref2.material="Plastic";
		ref2.color="Orange";
		ref2.size='S';
		System.out.println(ref2.material);
		System.out.println(ref2.color);
		System.out.println(ref2.size);
		System.out.println(" ");
		Spoon ref3=new Spoon();
		ref3.material="Wood";
		ref3.color="Brown";
		ref3.size='L';
		System.out.println(ref3.material);
		System.out.println(ref3.color);
		System.out.println(ref3.size);
		System.out.println(" ");
		Spoon ref4=new Spoon();
		ref4.material="Steel";
		ref4.color="Silver";
		ref4.size='S';
		System.out.println(ref4.material);
		System.out.println(ref4.color);
		System.out.println(ref4.size);
	}
}