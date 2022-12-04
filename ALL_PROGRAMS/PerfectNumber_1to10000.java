class PerfectNumber_1to10000 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10000 ;i++ )
		{
			//check i is perfect number or not
			//if i is perfect number print i

			int sum=0;
			for (int a=1;a<i ;a++ )
			{
				if (i%a==0)
				{
					sum=sum+a;
				}
			}
			if (sum==i)
			{
				System.out.println(i);
			}
		}
	}
}
