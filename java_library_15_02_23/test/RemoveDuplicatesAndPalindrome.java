package test;

public class RemoveDuplicatesAndPalindrome
{
	public static void main(String[] args) 
	{
		String s="madam";
		String result ="";
		for (int i=0;i<=s.length()-1;i++)
		{
			char c = s.charAt(i);
			int count=0;
			for (int j=0;j<=i-1;j++)
			{
				char d= s.charAt(j);
				if (c==d)
				{
					count++;
				}	
			}
			if (count==0)
			{
				result=result+c;
			}
		}
		System.out.println(result);
		String s2="";
		for (int i=result.length()-1;i>=0;i--)
		{
			char ch = result.charAt(i);
			s2=s2+ch;
		}
		if (result.equals(s2))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}

}
