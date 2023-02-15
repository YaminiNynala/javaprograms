package stringClass;

public class StringReverse_Strore_PalindromeChecking
{
public static void main(String[] args) {
	String s1 = "Mom";
	String s2 = "";
	for(int i = s1.length()-1; i>=0; i--)
	{
		char ch = s1.charAt(i);
		s2 = s2 + ch;
	}
	System.out.println("The reversed String from the "+s1+" is : "+s2);
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println("The Given String is a Palindrome");
	}
	else
	{
		System.out.println("The given String is not a Palindrome");
	}
}
}
