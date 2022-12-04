import java.util.Scanner;
class pattern_34 
{
	public static void main(String[] args) 
	{
		int x=11;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=5;j>=1 ;j-- )
			{
				if (i<=j)
				{
					System.out.print(" "+x+" ");
					while (true)
					{
						x++;
						int count=0;
						for (int a=1;a<=x ;a++ )
						{
							if (x%a==0)
							{
								count++;
							}
						}
						if (count==2)
						{
							break;
						}
					}
				}
			}
			System.out.println();
		}
	}
}
