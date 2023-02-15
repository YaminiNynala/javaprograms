package string;

public class VowelsInString 
{
	public static void main(String[] args) 
	{
		String s = "yamini";
		for (int i=0;i<=s.length()-1;i++)
		{
			char ch = s.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') 
			{
				System.out.println(ch+" at index "+i);
			}
		}
	}

}
