package Strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="yamini";
		String result ="";
		for (int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			int count=0;
			for (int j=i-1;j>=0;j--)
			{
				char d= s.charAt(j);
				if (c==d)
				{
					count++;
				}	
			}
			if (count==0)
			{
				result=result+c;
			}
		}
		System.out.println(result);
	}

}
