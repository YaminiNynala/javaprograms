class Addition
{
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void add(int a,double b)
	{
		System.out.println(a+b);
	}
}
class MainClass2 
{
	public static void main(String[] args) 
	{
		Addition.add(2,6);
	}
}
