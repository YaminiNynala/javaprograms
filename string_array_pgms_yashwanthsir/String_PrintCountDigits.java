package stringClass;

public class String_PrintCountDigits
{
public static void main(String[] args) 
{
	String s = "nexgile13567";
	int count = 0;
	for (int i=0 ; i<=s.length()-1 ; i++)
	{
		char ch =s.charAt(i);
		if (ch >= '0' && ch <= '9')
		{
			count++;
			System.out.print(ch+" ");
		}
	}
	System.out.println();
	System.out.println(count);
}
}
