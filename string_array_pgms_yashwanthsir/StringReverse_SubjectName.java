package stringClass;

public class StringReverse_SubjectName
{
public static void main(String[] args) {
	String subjectName = "JavaLibrary";
	for(int i = subjectName.length()-1; i>=0; i--)
	{
		char ch = subjectName.charAt(i);
		System.out.print(ch+" ");
	}
}
}
