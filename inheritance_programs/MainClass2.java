class C
{
	public int i=100;
	public void walk()
	{
		System.out.println("walk 5 km");
	}
}
class D extends C
{
	public void display()
	{
		System.out.println(i);
		walk();
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.display();
	}
}
