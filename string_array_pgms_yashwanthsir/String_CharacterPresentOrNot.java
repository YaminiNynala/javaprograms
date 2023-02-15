package stringClass;

import java.util.Scanner;

public class String_CharacterPresentOrNot
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the String : ");
	String word = sc.next();
	System.out.print("Enter the Char : ");
	char Char = sc.next().charAt(0);
	boolean status = false;
	for(int i = 0; i<=word.length()-1; i++)
	{
		char letter = word.charAt(i);
		if(letter == Char)
		{
			status = true;
			break;
		}
	}
	if(status)
	{
		System.out.println("Present");
	}
	else
	{
		System.out.println("Not Present");
	}
}
}
