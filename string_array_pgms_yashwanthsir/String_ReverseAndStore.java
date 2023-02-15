package stringClass;

public class String_ReverseAndStore
{
public static void main(String[] args) {
	String s1 = "Mom";
	String s2 = "";
	
	for(int i = 0; i<=s1.length()-1; i++)
	{
		char ch = s1.charAt(i);
		s2 = ch + s2;
	}
	System.out.println(s2);
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not a Palindrome");
	}
}
}
