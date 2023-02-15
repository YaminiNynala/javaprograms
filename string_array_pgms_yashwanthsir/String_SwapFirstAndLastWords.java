package stringClass;

public class String_SwapFirstAndLastWords
{
public static void main(String[] args) {
	String s = "I got placed in Capgemini";
	String[] stringArray = s.split(" ");
	
	String firstWord = stringArray[0];
	String lastWord = stringArray[4];
	
	firstWord = stringArray[4];
	lastWord = stringArray[0];
	
	System.out.println(firstWord +" "+ stringArray[1] +" "+ stringArray[2] +" "+ stringArray[3] +" "+ lastWord);
}
}
