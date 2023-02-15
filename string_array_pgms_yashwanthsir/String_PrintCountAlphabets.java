package stringClass;

public class String_PrintCountAlphabets
{
public static void main(String[] args) {
	String s = "nexgile123456";
	int count = 0;
	for(int i = 0; i<=s.length()-1; i++)
	{
		char ch = s.charAt(i);
		if(ch >= 'A' && ch<='Z'||
		ch >= 'a' && ch<='z')
		{
			count++;
			System.out.print(ch);
		}
	}
	System.out.println();
	System.out.println(count);
}
}
