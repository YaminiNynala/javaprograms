package stringClass;

import java.util.Scanner;

public class String_SwapFromRunTime
{
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.print("Enter the String : ");
	String s= scan.nextLine();
	String[] StringArray=s.split(" ");
	
	String swap = StringArray[0];
	StringArray[0]=StringArray[StringArray.length-1];
	StringArray[StringArray.length-1]=swap;
	
	for(String result : StringArray)
	{
		System.out.print(result+" ");
	}
	
}
}
