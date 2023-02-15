package stringClass;

public class ChangeCasing 
{
	public static void main(String[] args) 
	{
		String s="aBcDe";
		String s1="";
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				System.out.print(s.toUpperCase().charAt(i));
				//s1=s1+c;
			}
			else if(c>='A'&& c<='Z')
			{
				System.out.print(s.toLowerCase().charAt(i));
				//s1=s1+c;
			}
		}
		//System.out.println(s1);
		
	}

}
