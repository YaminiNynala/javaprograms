class Armstrong_number_1to10000 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10000 ;i++ )
		{
			int temp=i;
			int count=0;
			while (i!=0)
			{
				count++;
				i=i/10;
			}
			i=temp;
			int sum=0;
			int lastdigit=0;
			while (i!=0)
			{
				lastdigit=i%10;
				int exp=1;
				for (int a=1;a<=count ;a++ )
				{
					exp=exp*lastdigit;
				}
				sum=sum+exp;
				i=i/10;
			}
			i=temp;
			if (sum==i)
			{
				System.out.println(i);
			}
		}
	}
}
