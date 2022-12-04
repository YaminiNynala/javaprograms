import java.util.Scanner;
class  Natural_numbers_range
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("minimum range");
		int n1= scan.nextInt();
		System.out.println("maximum range");
		int n2 = scan.nextInt();
		
		for (int a=n1;a<=n2 ;a++ )
		{
			System.out.println(a);
		}
	}
}
