class Spy_number_1to1000 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		{
			int sum=0;
			int temp=i;
			int product=1;
			int lastdigit=0;
			while (i!=0)
			{
				lastdigit=i%10;
				sum=sum+lastdigit;
				product=product*lastdigit;
				i=i/10;
			}
			i=temp;
			if (sum==product)
			{
				System.out.println(i);
			}
		}
	}
}
