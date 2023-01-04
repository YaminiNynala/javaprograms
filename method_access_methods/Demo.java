class  Demo
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		walk();
		System.out.println("main starts");
	}
	public static void walk() 
	{
		System.out.println("walk starts");
		Demo d1 = new Demo();
		d1.run();
		System.out.println("walk ends");
	}
	public void run() 
	{
		System.out.println("run starts");
		System.out.println("run ends");
	}
}
