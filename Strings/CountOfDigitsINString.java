package Strings;

public class CountOfDigitsINString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Yamini@27-06-1999";
		int count=0;
		for (int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if (ch>='0' && ch<='9')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
