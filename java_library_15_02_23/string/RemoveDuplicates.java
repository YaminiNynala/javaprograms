package string;

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		String s="ramyamini";
		String result ="";
		for (int i=0;i<=s.length()-1;i++)
		{
			char c = s.charAt(i);
			int count=0;
			for (int j=0;j<=i-1;j++)
			{
				char d= s.charAt(j);
				//System.out.println(c);
				System.out.println(d);
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
