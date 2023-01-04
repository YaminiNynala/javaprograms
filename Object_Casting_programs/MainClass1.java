class A
{
	public void wings()
	{
		System.out.println("use wings for navigation purpose");
	}
}
class B extends A
{
	public void wheels()
	{
		System.out.println("wheels on the road");
	}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		A a1 = (A)new B();
		a1.wings();
		B b1 = (B)a1;
		b1.wings();
		b1.wheels();
	}
}
