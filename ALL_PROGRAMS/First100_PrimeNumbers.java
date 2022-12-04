class First100_PrimeNumbers 
{
	public static void main(String[] args) 
	{
		int x = 2;
		int primecount=1;
		while (primecount<=100)
		{
			int count=0;
			for (int a=1 ;a<=x ;a++ )
			{
				if (x%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(primecount+") "+x);
				primecount++;
			}
			x++;
		}
	}
}
