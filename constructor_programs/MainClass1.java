class Demo
{
	public Demo()
	{
		System.out.println("execute constructor without argument");
	}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		Demo d4 = new Demo();
	}
}
