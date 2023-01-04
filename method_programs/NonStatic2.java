class NonStatic2 
{
	public void display()
	{
		System.out.println("Display score");
	}
	public void result()
	{
		System.out.println("Show result");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		NonStatic2 n1 = new NonStatic2();
		n1.display();
		n1.result();
		System.out.println("main ends...");
	}
}
