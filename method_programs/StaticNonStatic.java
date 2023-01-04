class StaticNonStatic 
{
	public static void type()
	{
		System.out.println("Type Documents");
	}
	public static void watch()
	{
		System.out.println("Watching Videos");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		type();
        StaticNonStatic s1 = new StaticNonStatic();
		s1.watch();
		System.out.println("main ends...");
	}
}
