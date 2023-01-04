package Strings;

public class PrintAlphabetDigitSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Yamini@143";
		for (int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				System.out.println(ch);
				System.out.println("-------");
			}
			else if (ch>='0' && ch<='9')
			{
				System.out.println(ch);
			}
			else 
			{
				System.out.println(ch);
			}
		}
	}

}
