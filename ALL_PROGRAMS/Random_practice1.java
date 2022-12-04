
class Random_practice1 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;true ;i++ )
		{
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
			if (sum>100)
			{
				break;
			}
		}
	}
}
