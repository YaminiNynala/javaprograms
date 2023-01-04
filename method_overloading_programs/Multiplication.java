class Multiplication 
{
	public void multiply(int a,double b) 
	{
        System.out.println("***********************************");
		double c = a*b;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("Result : "+c);
		System.out.println("***********************************");
	}
	public void multiply(double a,double b,int c) 
	{
        double d = a*b*c;
		System.out.println("***********************************");
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("Result : "+d);
		System.out.println("***********************************");
	}
	public static void main(String[] args) 
	{
		
		Multiplication m1 = new Multiplication();
        m1.multiply(12,7.5);
		m1.multiply(5.6,2.3,100);
	}
}
