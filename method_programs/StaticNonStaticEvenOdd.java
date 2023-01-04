import java.util.Scanner;
class StaticNonStaticEvenOdd 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter any number");
	    int n = scan.nextInt();
		if (n==0)
		{
			System.out.println("No method is calling");
		}
		else if (n%2==0)
		{
			StaticNonStaticEvenOdd s1 = new StaticNonStaticEvenOdd();
			s1.even();
		}
		else 
		{
			odd();
		}
	}
	public void even()
	{
		System.out.println("Even number");
	}
	public static void odd()
	{
		System.out.println("Odd number");
	}
}
