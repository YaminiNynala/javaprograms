class Non_fibonacci_terms_1to100 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		int count=0;
		for (int i=0;i<=100 ;i++ )
		{
			if (i==sum)
			{
				sum=a+b;
				a=b;
				b=sum;
			}
			else
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
}