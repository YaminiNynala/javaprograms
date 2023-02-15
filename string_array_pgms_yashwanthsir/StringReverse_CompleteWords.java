package stringClass;

public class StringReverse_CompleteWords
{
public static void main(String[] args) {
	String sentence = "I got placed in Capgemini";
	for(int i = sentence.length()-1; i>=0; i--)
	{
		char ch = sentence.charAt(i);
		System.out.print(ch);
	}
}
}
