package exceptionClass;

import java.util.Scanner;

public class FinallyBlock 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int firstNumber = scan.nextInt();
		System.out.print("Enter the second number : ");
		int secondNumber = scan.nextInt();
		try
		{
			int result = firstNumber / secondNumber;		
			System.out.println(result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception Handled");
		}
		finally
		{
			System.out.println("Program terminated succesfully");
			System.out.println("Here after, no more executions...");
		}
	}
}
