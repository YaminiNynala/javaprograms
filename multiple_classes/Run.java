class A
{
	public static String msg = "Good Morning";
	public static void display()
	{
		System.out.println(msg);
	}
}
class B
{
	public int count = 100;
	public void info()
	{
		System.out.println(count);
	}
}
class Run
{
	public static void main(String[] args) 
	{
		A.display();
		B b1 = new B();
		b1.info();
	}
}

