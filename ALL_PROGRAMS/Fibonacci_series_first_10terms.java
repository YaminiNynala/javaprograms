class Fibonacci_series_first_10terms 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=10 ;i++ )
		{
			System.out.println(sum);
			a=b;   //b value is given to a
			b=sum; // sum value is given to b
            sum=a+b;
		}
	}
}
