class pattern_26 
{
	public static void main(String[] args) 
	{
		char x='A';
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i<=j)
				{
					System.out.print(" "+x+" ");
					x++;
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
