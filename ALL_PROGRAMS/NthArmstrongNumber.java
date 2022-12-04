class NthArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int x=1;
		int n=10;
		int ac=1;
		while (ac<=10)
		{
			int count=0;
			int temp=x;
			while (x!=0)
			{
				count++;
				x=x/10;
			}
			x=temp;
			int ld=0;
			int sum=0;
			while (x!=0)
			{
				ld=x%10;
				int exp=1;
				for (int a=1;a<=count ;a++ )
				{
					exp=exp*ld;
				}
				sum=sum+exp;
				x=x/10;
			}
			x=temp;
			if (x==sum)
			{
				if (ac==n)
				{
					System.out.println(ac+") "+x);
				}
				ac++;
			}
			x++;
		}
    }
}
