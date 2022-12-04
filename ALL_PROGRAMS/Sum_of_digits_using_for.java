class Sum_of_digits_using_for 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		//int num = 123;
		int ld =0;
		for (int num=123;num!=0 ;num/=10 )
		{
			ld = num%10;
			sum = sum+ld;
		}
		/*while (num!=0)
		{
			ld = num%10;
			sum = sum+ld;
			num =num/10;
		}*/
		System.out.println(sum);
	}
}
