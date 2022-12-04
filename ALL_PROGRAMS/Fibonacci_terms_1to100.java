class Fibonacci_terms_1to100 
{
	public static void main(String[] args) 
	{
		
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;true ;i++ )
		{
			System.out.println(i+") "+sum);
			a=b;   //b value is given to a
			b=sum; // sum value is given to b
            sum=a+b;
            if (sum>100)
            {
				break;
            }
		}
	}
}
