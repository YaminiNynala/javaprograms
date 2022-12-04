import java.util.Scanner;
class Mutiples_of_12_range
{
	public static void main(String [] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter min number");
		int min = scan.nextInt();
		System.out.println("enter max number");
		int max = scan.nextInt();
		for (int a=min;a<=max;a++ )
		{
			if (a%12==0)
			{
				System.out.println(a);
			}
		}
	}
}