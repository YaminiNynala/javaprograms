class Naturalnumbers_1to100_GivenManner 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=100 ;i++ )
		{
			int count=0;
			for (int a=1;a<=i ;a++ )
			{
				if (i%a==0)
				{
					count++;
				}
			}
			if (count<2)
			{
				System.out.println(i+" is neither prime nor composite number");
			}
			else if (count==2)
			{
				System.out.println(i+" is a prime number");
			}
			else 
			{
				System.out.println(i+" is a composite number");
			}
		}
	}
}
