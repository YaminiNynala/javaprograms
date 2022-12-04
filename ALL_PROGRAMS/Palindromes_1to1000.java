class Palindromes_1to1000 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=1000 ;i++ )
		{
			int temp=i;
			int lastdigit=0;
			int rev=0;
			while (i!=0)
			{
				lastdigit=i%10;
				rev = rev*10+lastdigit; //i becomes zero while reversing
				i=i/10;                 // so we are using temp
			}
			i=temp; // restoring the i value
			if (rev==temp)
			{
				System.out.println(temp);
			}
		}
	}
}
