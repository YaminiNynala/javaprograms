class Nth_perfect_number 
{
	public static void main(String[] args) 
	{
		int n=3;
		int x=1;
		int pc = 1;
		while (pc<=3)
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
				if (pc==n)
				{
					System.out.println(x);
				}
				pc++;
			}
			x++;
		}
	}
}
