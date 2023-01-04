class Subtraction 
{
	public static void subtract(double n1,double n2)
	{
		double n3 =n1-n2;
		System.out.println("number 1 : "+n1);
		System.out.println("number 2 : "+n2);
		System.out.println("difference is : "+n3);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		subtract (5.8,3.2);
		System.out.println("main ends...");
	}
}
