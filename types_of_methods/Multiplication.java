import java.util.Scanner;
class Multiplication 
{
	public static void multiply(int n)
	{
		for (int a=1;a<=10 ;a++ )
		{
			//int product = n*a;
			System.out.println(n+"*"+a+"="+n*a);
		}
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int n = scan.nextInt();
		multiply(n);
	}
}

