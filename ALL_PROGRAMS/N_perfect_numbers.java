class N_perfect_numbers 
{
	public static void main(String[] args) 
	{
		
		int x=1;
		int pc = 1;
		while (pc<=4)
		{
			int sum =0;
			for (int a=1;a<x ;a++ )
			{
				if (x%a==0)
				{
					sum =sum+a;
				}
			}
			if (sum==x)
			{
				System.out.println(x);
				pc++;
			}
			x++;
		}
	}
}