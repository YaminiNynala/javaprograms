package string;

public class SumOfDigitsInString {

	public static void main(String[] args) 
	{
		String s="capegemini56178";
		int sum=0;
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if (ch>='0' && ch<='9')
			{
				sum = sum + Integer.parseInt(ch+"");
			}
		}
		System.out.println(sum);
	}

}
