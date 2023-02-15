package stringClass;

import java.util.Scanner;

public class String_PrintTheLongestSubString
{
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the String : ");
	String string = scan.nextLine();
	String[] stringArray = string.split(" ");
	int maxLength = stringArray[0].length();
	String subString = stringArray[0];
	for(int i = 1; i<=stringArray.length-1; i++)
	{
		if(maxLength < stringArray[i].length())
		{
			maxLength = stringArray[i].length();
			subString = stringArray[i];
 		}
	}
	System.out.println(maxLength);
	System.out.println(subString);
}
}
