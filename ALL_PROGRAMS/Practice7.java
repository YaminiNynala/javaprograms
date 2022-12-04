import java.util.Scanner;
class  Practice7
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n1=scan.nextInt();
		if (n1%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}
}
