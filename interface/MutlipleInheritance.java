interface A
{
	void test1();
}
interface B
{
	void test2();
}
interface C extends A,B
{
	void test3();
}
class Demo implements C
{
	public void test1()
	{
		System.out.println("Test1 completed");
	}
	public void test2()
	{
		System.out.println("Test2 completed");
	}
	public void test3()
	{
		System.out.println("Test3 completed");
	}
}
class MutlipleInheritance 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		d1.test1();
		d1.test2();
		d1.test3();
	}
}
