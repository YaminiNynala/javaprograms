package stringClass;

public class SumOfTwoNumbersFromString_AnotherLogic {
public static void main(String[] args) {
	String str = "abc123de45g6";
	String temp = "0";
	int sum = 0;
	
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		
		if (i == str.length()-1 && ch<='9'&&ch>='0')
		{
			temp = temp + ch;
			sum = sum + Integer.parseInt(temp);
		}
		else if(ch<='9'&&ch>='0')
		{
			temp = temp + ch;
		}
		else
		{
			sum = sum + Integer.parseInt(temp);
			temp = "0";
		}
	}
		System.out.println("Sum of Numbers in a String : "+sum);
	}
}
