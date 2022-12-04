import java.util.Scanner;
class Count_the_repeated_digits 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("Enter a digit to count how many times it is printed");
		int digit = scan.nextInt();
		int lastdigit=0;
		int count=0;
		while (num!=0)
		{
			lastdigit = num%10;
			if (digit==lastdigit)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
}
