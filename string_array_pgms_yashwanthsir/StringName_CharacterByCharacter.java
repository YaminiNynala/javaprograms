package stringClass;

public class StringName_CharacterByCharacter
{
public static void main(String[] args) {
	String name = "Vijay";
	for(int i = 0; i<=name.length()-1; i++)
	{
		char ch = name.charAt(i);
		System.out.print(ch+" ");
	}
}
}
