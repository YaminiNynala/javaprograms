package stringClass;

public class String_PrintOccurence
{
public static void main(String[] args) {
	String s = "WebTechnology";
	for(int i = 0; i<=s.length()-1; i++)
	{
		int count = 0;
		for(int j = i+1; j<s.length(); j++)
		{
			if (s.charAt(i) == s.charAt(j))
			{
				count++;
			}
		}
System.out.println(s.charAt(i)+" is occured "+count+" time(s) again in the given String");
	}
}
}
