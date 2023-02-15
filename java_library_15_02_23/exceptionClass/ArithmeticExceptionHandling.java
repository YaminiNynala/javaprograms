package exceptionClass;

import java.util.Scanner;

public class ArithmeticExceptionHandling 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int firstNumber = scan.nextInt();
		System.out.print("Enter the second number : ");
		int secondNumber = scan.nextInt();
		while(true)
		{
			try
			{
				int result = firstNumber / secondNumber;		
				System.out.println(result);
				break;
			}
			catch(ArithmeticException ae)
			{
				System.out.println("The values you entered are wrong, Re-enter the values");
				System.out.print("Re-Enter the first number : ");
				firstNumber = scan.nextInt();
				System.out.print("Re-Enter the second number : ");
				secondNumber = scan.nextInt();
			}
			
		}
	}
}
