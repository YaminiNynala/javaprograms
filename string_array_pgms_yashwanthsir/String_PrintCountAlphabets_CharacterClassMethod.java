package stringClass;

public class String_PrintCountAlphabets_CharacterClassMethod
{
public static void main(String[] args) {
	String s = "nexgile1345776";
	int count = 0;
	for(int i = 0; i<=s.length()-1; i++)
	{
	 	char ch = s.charAt(i);
	 	if(Character.isAlphabetic(ch))
	 	{
	 		count++;
	 		System.out.print(ch);
	 	}
	}
	System.out.println();
	System.out.println(count);
}
}
