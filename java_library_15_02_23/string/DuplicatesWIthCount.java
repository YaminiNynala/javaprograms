package string;

public class DuplicatesWIthCount 
{
	public static void main(String[] args)
	{
		String s = "ramyamini";
		String result = "";
		for (char ch='a';ch<='z';ch++)
		{
			int count=0;
			for (int i=s.length()-1;i>=0;i--)
			{
				//System.out.println(ch);
				char c = s.charAt(i);
				//System.out.println(c);
				if (ch==c)
				{
					count++;
				}
			}
			if (count==1 || count>1)
			{
				result=result+ch;
			}
		}
		System.out.println(result);
	}

}
