class  Demo
{
	public static int x = 27;
	public static int y = 21;
	public double a = 2.7;
	public double b = 2.1;
	public static void main(String[] args) 
	{
		System.out.println(x);
		System.out.println(y);
		Demo rv1 = new Demo();
		Demo rv2 = new Demo();

		System.out.println(rv1.a);
		System.out.println(rv2.a);
		
        System.out.println(rv1.b);
		System.out.println(rv2.b);
	}
}
