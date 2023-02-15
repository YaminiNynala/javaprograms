package exceptionClass;

import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionHandling
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the name of the Subject : ");
		String subjectName = scan.nextLine();
		System.out.print("Enter the index from 0 to "+(subjectName.length()-1)+" to retrieve any character from the subject name : ");
		int index = scan.nextInt();
		char ch;
		while(true)
		{
			try
			{
				ch = subjectName.charAt(index);
				System.out.println("The particular character from the given string : "+ch);
				break;
			}
			catch(StringIndexOutOfBoundsException sioobe)
			{
				System.out.print("Re-Enter the index from 0 to "+(subjectName.length()-1)+" to retrieve the first letter from the subject name : ");
				index = scan.nextInt();		
			}
		}
	}
}
