import java.util.Scanner;
class  Even_naturalnumbers_range_for
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter minimum range");
		int min = scan.nextInt();
		System.out.println("enter maximum range");
		int max = scan.nextInt();
		for (int a=min;a<=max ;a++ )
		{
			if (a%2==0)
			{
				System.out.println(a);
			}
		}
	}
}
