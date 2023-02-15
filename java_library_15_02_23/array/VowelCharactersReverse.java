package array;

public class VowelCharactersReverse 
{
	public static void main(String[] args) 
	{
		String s ="yamini";
		for (int i=s.length()-1;i>=0;i--)
		{
			char ch = s.charAt(i);
			if (ch=='a' || ch=='e'  || ch=='i'  || ch=='o'  || ch=='u')
			{
				System.out.println(ch +" at index "+i);
			}
		}
	}

}
