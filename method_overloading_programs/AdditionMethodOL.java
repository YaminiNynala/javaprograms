class AdditionMethodOL 
{
	public static void add(int a,int b) 
	{
        System.out.println("***********************************");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("Result : "+(a+b));
		System.out.println("***********************************");
	}
	public static void add(double a,double b) 
	{
		System.out.println("***********************************");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("Result : "+(a+b));
		System.out.println("***********************************");
	}
	public static void add(int a,double b,int c) 
	{
		System.out.println("***********************************");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("Result : "+(a+b+c));
		System.out.println("***********************************");
	}
	public static void main(String[] args) 
	{
		add(5,3);
		add(4.5,5.7);
		add(25,4.7,10);
	}
}
