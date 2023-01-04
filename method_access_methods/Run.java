class Run 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Run r1 = new Run();
		r1.read();
		System.out.println("main starts");
	}
	public void read()
	{
        System.out.println("read chapter 4");
		write();
	}
	public void write()
	{
		System.out.println("write chapter 4");
	}
}

