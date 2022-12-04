import java.util.Scanner;
class Largest_of_five_numbers 
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
		System.out.println("enter five numbers one by one");
		int large =0;
		for (int a=1;a<=5 ;a++ )
		{
			int n = scan.nextInt();
			if (n>large)
			{
				large=n;
			}
		}
		System.out.println("Largest number is "+large);
	}
}
