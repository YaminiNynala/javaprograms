import java.util.Scanner;
class Harshad_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a harshad number or not");
		int num = scan.nextInt();
		int temp=num;
		int sum = 0;
		int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;
		}
		if (temp%sum==0)
		{
			System.out.println("Harshad number");
		}
		else
		{
			System.out.println("not harshad number");
		}
	}
}
