package stringClass;

public class String_PrintCountTheVowels
{
public static void main(String[] args) {
	String s = "JavaLibrary";
	int count = 0;
	System.out.println("The vowels present in the given String are...");
	for(int i = 0; i<=s.length()-1; i++)
	{
		char ch = s.charAt(i);
		if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' ||
ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch =='U' || 
ch == 'u')
		{
			count++;
			System.out.print(ch+" ");
		}
	}
	System.out.println();
	System.out.println("The count of vowels present in given String is : "+count);
}
}
