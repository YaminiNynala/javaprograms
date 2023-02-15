package exceptionClass;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionHandling 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int array[] = {10,20,30,40,50};
		System.out.print("Enter the index value : ");
		int index = scan.nextInt();
		while(true)
		{
			try
			{
				System.out.print("The value of the index "+index+" is : "+array[index]);
				break;
			}
			catch(ArrayIndexOutOfBoundsException aioobe)
			{
				System.out.print("Re-enter the index value : ");
				index = scan.nextInt();
			}
		}
	}
}
