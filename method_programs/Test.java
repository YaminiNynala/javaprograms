class Test 
{
	public void move()
	{
		System.out.println("move north");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
        Test t1 = new Test();
        t1.move();
		System.out.println("main ends...");
	}
}
