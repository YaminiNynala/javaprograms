class Division 
{
	public static void divide(int a,int b) 
	{
		int c = a/b;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("Result : "+c);
		System.out.println("*************************");
	}
	public void divide(double a,double b) 
	{
		double c = a%b;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("Result : "+c);
	}
	public static void main(String[] args) 
	{
		divide(100,5);
		Division d1 = new Division();
		d1.divide(10,7.5);
	}
}

