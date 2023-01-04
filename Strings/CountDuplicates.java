package Strings;

public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Ramyamini";
		String result = "";
		for (char ch='a';ch<='z';ch++)
		{
			int count=0;
			for (int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				if (ch==c)
				{
					count++;
				}
			}
			if (count==1||count>1)
			{
				result+=ch;
			}
		}
		System.out.println(result);
	}

}
