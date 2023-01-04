package Strings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="yamini";
		
		//char ch1=s.charAt(0);    fetching a single character
		//System.out.println(ch1);   output: R
		
		for (int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			System.out.print(ch);
		}
	}

}
