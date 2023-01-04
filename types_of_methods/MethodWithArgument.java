class MethodWithArgument 
{
	public static void test1(int a)
	{
		System.out.println(a);
	}
	public static void test2(boolean k)
	{
		System.out.println(k);
	}
	public void test3(double z)
	{
		System.out.println(z);
	}
	public void test4(int i,double j)
	{
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] args) 
	{
		test1(10);
		test2(true);
		MethodWithArgument m1 = new MethodWithArgument();
		m1.test3(7.9);
		m1.test4(100,99.9);
	}
}
