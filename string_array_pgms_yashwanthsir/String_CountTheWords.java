package stringClass;

public class String_CountTheWords
{
public static void main(String[] args) {
	String s = "I got placed in Capgemini";
	String[] stringArray = s.split(" ");
	System.out.println(stringArray.length);
	System.out.println(stringArray[4].length());
}
}
