import java.util.Scanner;
class Next_prime_number_1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get the second next prime number");
		int x = scan.nextInt();
		
		int primecount=0;
		while (true)
		{
			x++;
			int count=0;
			for (int a=1;a<=x ;a++ )
			{
				if (x%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				primecount++;
			}
			if (primecount==2)
			{
				System.out.println(x);
			    break;
			}
		}
	}
}
