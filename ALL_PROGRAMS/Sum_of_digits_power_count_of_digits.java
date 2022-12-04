import java.util.Scanner;
class Sum_of_digits_power_count_of_digits 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = scan.nextInt();
		int count=0;
		int temp=n;
		while (n!=0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		int sum=0;	
		int lastdigit=0;
		while (n!=0)
		{
			lastdigit=n%10;
			int exp=1;
			for (int a=1;a<=count ;a++ )
			{
				exp=exp*lastdigit;
			}
			sum=sum+exp;
			n=n/10;
		}
		System.out.println(sum);
	}
}
