package stringClass;

public class String_LocationOfCharacter
{
public static void main(String[] args) {
	String s = "JavaLibrary";
	int location = s.indexOf('L');
	System.out.println(location+" Location of L");
	System.out.println(s.indexOf('a')+" Location of a");
	System.out.println(s.indexOf('a', 4)+" Location of last a");
	System.out.println(s.indexOf('e'));//Not Present Char
}
}
