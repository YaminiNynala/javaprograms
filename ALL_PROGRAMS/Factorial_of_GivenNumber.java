import java.util.Scanner;
class  Factorial_of_GivenNumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its factorial");
		int num = scan.nextInt();
		int factorial=1;
		for (int a=1;a<=num ;a++ )
		{
			factorial=factorial*a;
		}
		System.out.println("The factorial of "+num+" is :"+factorial);
	}
}
