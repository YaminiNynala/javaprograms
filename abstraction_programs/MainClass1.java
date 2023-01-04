interface Sample
{
	void test();
}
class Demo implements Sample
{
	public void test()
	{
		System.out.println("Method implementation is hidden");
	}
}
class Run
{
	public static Sample getObject() // in place of void we write the interface name
	{
		Sample s = new Demo();
		return s;
	}
}
class MainClass1
{
	public static void main(String[] args) 
	{
		//Run r1 = new Run();
		Sample rv = Run.getObject();
		rv.test();
	}
}
