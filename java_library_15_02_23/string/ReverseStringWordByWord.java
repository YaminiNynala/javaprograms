package string;

public class ReverseStringWordByWord 
{
	public static void main(String[] args) 
	{
		String s= "yamini and ramya";
		String words[] = s.split(" ");
		String reverseString = "";
		for (String w:words)
		{
			String reverseWord = "";
			for (int i=w.length()-1;i>=0;i--)
			{
				char ch = w.charAt(i);
				reverseWord=reverseWord+ch;
			}
			reverseString = reverseString+reverseWord+" ";
		}
		System.out.println(reverseString);
	}

}