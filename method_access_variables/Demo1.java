class Demo1 
{
	public double a = 2.7;
	public void info()
	{
		Demo1 d1 = new Demo1();
		System.out.println(d1.a);
	}
	public static void main(String[] args) 
	{
		Demo1 d2 = new Demo1();
		d2.info();
	}
}
