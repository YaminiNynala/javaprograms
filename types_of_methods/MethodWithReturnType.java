class MethodWithReturnType 
{
	public static double test1() 
	{
		return 8.5;
	}
	public static boolean test2()
	{
		return true;
	}
	public int test3()
	{
		return 99;
	}
	public static void main(String[] args) 
	{
		double z = test1();
		boolean k = test2();
        MethodWithReturnType m1 = new MethodWithReturnType();
		int a = m1.test3();
	}
}
