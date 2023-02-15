package exceptionClass;

import java.util.Scanner;

public class ImplicitPropagation 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the first number : ");
		int firstNumber = scan.nextInt();
		System.out.print("Enter the second number : ");
		int secondNumber = scan.nextInt();
		try 
		{
			divide(firstNumber, secondNumber);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception Handled");
		}
	}
	public static void divide(int a , int b)
	{
			int result = a / b;
			System.out.println(result);
	}
}

/*
 public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the first number : ");
		int firstNumber = scan.nextInt();
		System.out.print("Enter the second number : ");
		int secondNumber = scan.nextInt();
		divide(firstNumber, secondNumber);
	}
	public static void divide(int a , int b)
	{
		try
		{
			int result = a / b;
			System.out.println(result);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception Handled");
		}
	}
*/
