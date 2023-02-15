package stringClass;

import java.util.Scanner;

public class String_PrintTheShortestSubString
{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the String : ");
	String string = scan.nextLine();
	String[] stringArray = string.split(" ");
	int minLength = stringArray[0].length();
	String subString = stringArray[0];
	for(int i = 0; i<=stringArray.length-1; i++)
	{
		if(minLength > stringArray[i].length())
		{
			minLength = stringArray[i].length();
			subString = stringArray[i];
		}
	}
	System.out.println("Given String is : "+string);
	System.out.println("The Shortest SubString from the given String is : "+subString);
}
}