package string;

public class PalindromeOrNot {

	public static void main(String[] args) 
	{
		String s1 = "yamay";
		String s2="";
		for (int i=s1.length()-1;i>=0;i--)
		{
			char ch = s1.charAt(i);
			s2=s2+ch;
		}
		if (s1.equals(s2))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}

}
