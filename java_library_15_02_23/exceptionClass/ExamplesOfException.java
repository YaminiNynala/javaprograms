package exceptionClass;

import java.util.Scanner;

import objectClass.Employee;

public class ExamplesOfException 
{
	static String string;
	public static void main(String[] args) 
	{
		//ArithmeticException
		int a = 25;
		int b = 5;
		int result = a/b;
		System.out.println(result);
		
		//StringIndexOutOfBoundsException
		String s = "java";
		char ch = s.charAt(3);
		System.out.println(ch);
		
		//ArrayIndexOutOfBoundsException
		int[] intArray = new int[2];
		intArray[0] = 12;
		intArray[1] = 45;
		//intArray[2] = 34;
		System.out.println(intArray[1]);
		
		//NegativeArraySizeException
		Employee[] e = new Employee[5]; //ctrl+shift+o to import class from another package
		
		//NullPointerException
		//System.out.println(string.charAt(0));
		
		//InputMismatchException
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int number = scan.nextInt();
		
		//NumberFormatException
		int i = Integer.parseInt("27");  //("10.5");  // parse method  : "10" ---> 10 (pre-defined data)
		Integer i1 = Integer.valueOf("21"); //("java"); // valueOf method: "10" ---> 10 (Object 10)
		
		//ClassCastException
	}
}
