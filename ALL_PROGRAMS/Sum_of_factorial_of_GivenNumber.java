import java.util.Scanner;
class Sum_of_factorial_of_GivenNumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get the sum of factorial of digits in the given number");
		int num = scan.nextInt();
		int temp=num;
		int sum=0;
		int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			int factorial=1;
			for (int a=1;a<=lastdigit ;a++ )//finding the factorial of digit
			{
				factorial=factorial*a;
			}
            sum=sum+factorial;
			num=num/10;
		}
		System.out.println("the sum of factorial of digits of the "+temp+" is "+sum);
	}
}
