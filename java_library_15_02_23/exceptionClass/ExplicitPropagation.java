package exceptionClass;

public class ExplicitPropagation 
{
	//1st method
	public static void main(String[] args)  throws InterruptedException
	{
		toSlowDown();
	}
	public static void toSlowDown() throws InterruptedException
	{
		System.out.println("here, The execution starts...");
		System.out.println("At this point, It slows down...");
		Thread.sleep(2000);
		System.out.println("Hey thread, wake up...There are some executions JVM has to done...");
	}
}

/*
2nd method
public static void main(String[] args)  throws InterruptedException
	{
		System.out.println("here, The execution starts...");
		System.out.println("At this point, It slows down...");
		Thread.sleep(2000);
		System.out.println("Hey thread, wake up...There are some executions JVM has to done...");
	}


3rd method
public static void main(String[] args)  
{
	try
	{
		toSlowDown();
	}
	catch (InterruptedException ie)
	{
	}
}

public static void toSlowDown() throws InterruptedException
{
	System.out.println("here, The execution starts...");
	System.out.println("At this point, It slows down...");
	Thread.sleep(2000);
	System.out.println("Hey thread, wake up...There are some executions JVM has to done...");
}

*/