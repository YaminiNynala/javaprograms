package stringClass;

public class String_PrintEvenIndexPositionCharacter
{
public static void main(String[] args) {
	String s = "WebTechnology";
	for(int i = 0; i<=s.length()-1; i++)
	{
		char ch = s.charAt(i);
		if(i%2 == 0)
		{
			System.out.println(ch);
		}
	}
}
}
