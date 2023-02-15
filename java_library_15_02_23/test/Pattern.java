package test;

public class Pattern {

	public static void main(String[] args) 
	{
		int space = 4;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=9;j++)
			{
				if (j<=4)
				{
					space--;
				}
				else 
				{
				System.out.print(" * ");
				}
			}
			System.out.println();
		}
	}

}
