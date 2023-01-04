class A
{
	public int i=10;
}
class B extends A
{
	public int j=100;
	public void display()
	{
		System.out.println("inherited variable : "+i);
		System.out.println("own variable : "+j);
	}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.display();
	}
}
