import java.util.Scanner;
class Spy_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is spy number or not");
		int num=scan.nextInt();
		int temp=num;
		int sum=0;
		int lastdigit=0;
		int product=1;
		while (num!=0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			num=num/10;
		}
		if (sum==product)
		{
			System.out.println(temp+" is spy number");
		}
		else
		{
			System.out.println(temp+" is not a spy number");
		}
	}
}
