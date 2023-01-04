class MethodUsingForLoop 
{
	public static void typeMessage()
	{
		System.out.println("chat with mom");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		for (int a=1;a<=5 ;a++ )
		{
			typeMessage();
		}
		System.out.println("main ends...");
	}
}
