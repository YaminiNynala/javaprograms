package Strings;

public class DigitsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="yamini@1999";
		int count=0;
		
		for (int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if (ch>='0' && ch<='9')
			{
				System.out.print(ch);
			}
		}
	}
}
