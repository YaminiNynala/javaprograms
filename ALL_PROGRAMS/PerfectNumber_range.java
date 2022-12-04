import java.util.Scanner;
class PerfectNumber_range 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter min range");
		int min = scan.nextInt();
		System.out.println("enter max range");
		int max = scan.nextInt();
		for (int i=min;i<=max ;i++ )
		{
			int sum=0;
			for (int a=1;a<i ;a++ )
			{
				if (i%a==0)
				{
					sum=sum+a;
				}
			}
			if (sum==i)
			{
				System.out.println(i);
			}
		}
	}
}
