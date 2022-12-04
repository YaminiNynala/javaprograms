class Strong_number_1to50000 
{
	public static void main(String[] args) 
	{
		
		for (int i=1;i<=50000;i++ )
		{
			int temp=i;
			int sum=0;
			int lastdigit=0;
			while (i!=0)
			{
				lastdigit=i%10;
				int factorial=1;
				for (int a=1;a<=lastdigit ;a++ )
				{
					factorial=factorial*a;
				}
				sum=sum+factorial;
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
