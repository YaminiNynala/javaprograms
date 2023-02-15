package stringClass;

public class String_ReverseTheSubjectName
{
public static void main(String[] args) {
	String subjectName = "Web Technology";
	for(int i = subjectName.length()-1; i>=0; i--)
	{
		System.out.print(subjectName.charAt(i));
	}
}
}
