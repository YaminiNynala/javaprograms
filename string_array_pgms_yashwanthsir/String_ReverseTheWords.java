package stringClass;

public class String_ReverseTheWords
{
public static void main(String[] args) {
	String s = "I got placed in Capgemini";
	String[] stringArray = s.split(" ");
	for(int i = stringArray.length-1; i>=0; i--)
	{
		reverse(stringArray[i]);
	}
}
public static void reverse(String s)
{
	for(int i = 0; i<=s.length()-1; i++ )
	{
		System.out.print(s.charAt(i));
	}
	System.out.print(" ");
}
}
