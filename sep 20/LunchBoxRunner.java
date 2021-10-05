class LunchBoxRunner
{
	public static void main(String[] chapati)
	{
		String name="Smart Buy";
	    String material="Stainless Steel";
		int noofcontainers=3;
		LunchBox lunch=new LunchBox(name,material,noofcontainers);
		System.out.println(lunch.name);
		System.out.println(lunch.material);
		System.out.println(lunch.price);
		System.out.println(lunch.capacity);
		System.out.println(lunch.noofcontainers);
		System.out.println(name==lunch.name);
		System.out.println(lunch.capacity==lunch.noofcontainers);
	}
}