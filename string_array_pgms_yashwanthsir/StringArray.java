package arrayObject;

import java.util.Scanner;

public class StringArray
{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the size of the Subjects : ");
	int size = scan.nextInt();
	String[] stringArray = new String[size];
	for(int i = 0; i<=stringArray.length-1; i++)
	{
		System.out.println("Enter the Subject Name at index : "+i);
		stringArray[i] = scan.next();
	}
	for(int i = 0; i<=stringArray.length-1; i++)
	{
		System.out.println(stringArray[i]);
	}
}
}
