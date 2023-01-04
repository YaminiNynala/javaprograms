package Strings;

public class CountAlphaDigitSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="N.Yamini@143";
		int countA=0;
		int countD=0;
		int countS=0;
		for (int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				countA++;
			}
			else if (ch>='0' && ch<='9')
			{
				countD++;
			}
			else 
			{
				countS++;
			}
		}
		System.out.println("Alphabet: "+countA);
		System.out.println("Digit: "+countD);
		System.out.println("Special: "+countS);
	}
}
