class A
{
	public static int x = 1;
}
class B
{
	public static int m = 10;
	public int n = 20;
}
class C
{
	public static double i = 2.7;
	public double j = 2.1;
	public static void yamini()
	{
		System.out.println(A.x);
		B b1 = new B();
		System.out.println(b1.n);
		System.out.println(i);
		C c1 = new C();
		System.out.println(c1.j);
	}
	public void ramya()
	{
		yamini();
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
        C c1 = new C();
		c1.ramya();
	}
}
