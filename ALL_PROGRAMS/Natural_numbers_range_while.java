import java.util.Scanner;
class Natural_numbers_range_while 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minimum range");
		int min = scan.nextInt();
		System.out.println("Enter maximum range");
		int max = scan.nextInt();
		 
		int a=min;
		while (a<=max)
		{
			System.out.println(a);
			a++;
		}
	}
}
