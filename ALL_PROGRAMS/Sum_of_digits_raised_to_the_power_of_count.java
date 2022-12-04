import java.util.Scanner;
class Sum_of_digits_raised_to_the_power_of_count 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number ");
		int n = scan.nextInt();
		int sum=0;
		int count=0;
		int exp=1;
		int lastdigit=0;
		int rev=0;
		while (n!=0)
		{
			lastdigit=n%10;
			count++;
			for (int a=1;a<=count ;count++ )
			{
				exp=exp*lastdigit;
			}
			sum=sum+exp;
			n=n/10;
		}
		System.out.println(sum);
	}
}
