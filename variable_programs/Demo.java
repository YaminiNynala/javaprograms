class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
        test();
		Demo d1 = new Demo();
		display();
		System.out.println("main ends...");
	}
	public static void test()
	{
		int k = 89;
		System.out.println(k);
	}
	public static void display()
	{
		double z = 1.2;
		System.out.println(z);
	}
}
