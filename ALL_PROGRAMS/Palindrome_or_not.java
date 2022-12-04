import java.util.Scanner;
class Palindrome_or_not 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a palindrome or not");
		int num = scan.nextInt();
		int temp=num;
		int lastdigit=0;
		int rev=0;
		while (num!=0)
		{
			lastdigit=num%10;
			rev=rev*10+lastdigit;
			num=num/10;
		}
		if (rev==temp) //number will become zero so we are using temp
		{
			System.out.println(temp+" is a palindrome number");
		}
		else 
		{
			System.out.println(temp+" is not a palindrome number");
		}
	}
}
