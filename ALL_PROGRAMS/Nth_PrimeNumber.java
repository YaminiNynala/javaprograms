import java.util.Scanner;
class Nth_PrimeNumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n value to print n prime numbers");
		int n = scan.nextInt();
		int x = 2;
		int primecount=1;
		while (primecount<=n)
		{
			int count=0;
			for (int a=1 ;a<=x ;a++ )
			{
				if (x%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				if (primecount==n)
				{
					System.out.println(x);
				}
				primecount++;
			}
		    x++;
		}
	}
}
