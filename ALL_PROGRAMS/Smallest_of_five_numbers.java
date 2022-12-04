import java.util.Scanner;
class Smallest_of_five_numbers 
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
		System.out.println("enter five numbers one by one");
		int n1 = scan.nextInt();
		int small =n1;
		for (int a=1;a<=4 ;a++ )
		{
			int n = scan.nextInt();
			if (n<small)
			{
				small=n;
			}
		}
		System.out.println("Smallest number is "+small);
	}
}

