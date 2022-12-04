import java.util.Scanner;
class  Factors_of_given_number
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to print its factorial");
		int num = scan.nextInt();
		for (int a=1;a<=num ;a++ )
		{
			if (num%a==0)
			{
				System.out.println(a);
			}
		}
	}
}
