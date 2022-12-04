import java.util.Scanner;
class Keith_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is keith number or not");
		int num= scan.nextInt();
		int temp=num;
		int c=num%10;
		num=num/10;
		int b=num%10;
		num=num/10;
		int a = num%10;
		int sum=0;
		for (int i=1;sum<temp ;i++ )
		{
			sum=a+b+c;
			a=b;
			b=c;
			c=sum;
		}
		if (sum==temp)
		{
			System.out.println("yes");
		}
	    else
		{
			System.out.println("no");
		}
	}
}
