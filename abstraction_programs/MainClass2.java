abstract class A
{
	abstract public void walk();
}
class B extends A
{
	public void walk()
	{
		System.out.println("walk is completed");
	}
}
class C 
{
	public A fetchObject()
	{
		A a1 = new B();
		return a1;
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		A rv = c1.fetchObject();
		rv.walk();
	}
}
