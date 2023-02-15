package stringClass;

public class String_PrintDuplicates
{
public static void main(String[] args) {
	String s = "WebTechnology";
	System.out.println("The Duplicates present from the given String is : ");
	for(int i = 0; i<=s.length()-1; i++)
	{
		for(int j = i+1; j<=s.length()-1; j++)
		{
			if(s.charAt(i) == s.charAt(j))
			{
				System.out.print(s.charAt(i)+" ");
			}
		}
	}
}
}
