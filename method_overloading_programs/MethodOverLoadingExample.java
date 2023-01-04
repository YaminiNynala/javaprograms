class MethodOverLoadingExample 
{
	public static void test(int i) 
	{
		System.out.println("Execute test method with int arg");
		System.out.println(i);
	}
	public static void test(double i) 
	{
		System.out.println("Execute test method with double arg");
		System.out.println(i);
	}
	public static void test(int i,double j,int k) 
	{
		System.out.println("Execute test method with int,double,int arg");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
	public static void test(char ch,boolean b) 
	{
		System.out.println("Execute test method with char,boolean arg");
		System.out.println(ch);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		test(27.21);//2
		test(27);   //1 
		test(27,27.21,21);//3
		test('@',true);   //4
	}
}
