import java.util.Scanner;
class First_n_PrimeNumbers 
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
			//counting the factors
			int count=0;
			for (int a=1 ;a<=x ;a++ )
			{
				if (x%a==0)
				{
					count++;
				}
			}
			//checking whether it is prime or not
			if (count==2)
			{
				System.out.println(primecount+") "+x);
				primecount++;
			}
		    x++;
		}
	}
}

