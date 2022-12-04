import java.util.Scanner;
class Usermultiples_range
{
	public static void main(String [] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter min number");
		int min = scan.nextInt();
		System.out.println("enter max number");
		int max = scan.nextInt();
		System.out.println("enter a number to print its multiples");
		int multiple = scan.nextInt();		
		for (int a=min;a<=max;a++ )
		{
			if (a%multiple==0)
			{
				System.out.println(a);
			}
		}
	}
}
