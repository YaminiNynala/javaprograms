class WhileNonStatic 
{
	public void laptop()
	{
		System.out.println("hp");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		
		int a=1;
		while (a<=4)
		{
			WhileNonStatic w1 = new WhileNonStatic();
			w1.laptop();
			a++;
		}
		System.out.println("main ends...");
	}
}
