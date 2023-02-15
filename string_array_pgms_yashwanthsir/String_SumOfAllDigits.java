package stringClass;

public class String_SumOfAllDigits
{
public static void main(String[] args) {
	String s = "Capgemini5678";
	int sum = 0;
	for(int i = 0; i<=s.length()-1; i++)
	{
		char ch = s.charAt(i);
		if(Character.isDigit(ch))
		{
			int result = Integer.parseInt(ch+"");
			sum = sum + result;
		}
	}
	System.out.println(sum);
}
}
