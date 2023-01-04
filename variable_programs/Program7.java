class Program7 
{
	public static int x=10;
	public String y = "yamini";
	public static void method1()
	{
		int a = 100;
		System.out.println(a);
	}
	public static void method2()
	{
		int b = 200;
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		System.out.println(x);
		Program7 p1 = new Program7();
		System.out.println(p1.y);
		method1();
		p1.method2();
	}
}
