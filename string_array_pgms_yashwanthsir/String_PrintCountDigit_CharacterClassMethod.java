package stringClass;

public class String_PrintCountDigit_CharacterClassMethod
{
public static void main(String[] args) {
	String employeeId = "TYP1701";
	int count = 0;
	for ( int i=0;i<=employeeId.length()-1;i++)
	{
		char ch = employeeId.charAt(i);
		if(Character.isDigit(ch))
		{
			count++;
			System.out.print(ch+" ");
		}
	}
	System.out.println();
	System.out.println(count);
}
}
