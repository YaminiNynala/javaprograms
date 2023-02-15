package test;

public class SumPrimeOrNot 
{
	public static void main(String[] args) 
	{
		int a[] = {23,34,72,51,63};
		int sum=0;
		for (int i=0;i<=a.length-1;i++)
		{
			int num = a[i];
			int temp = num;
			int ld=0;
			while (num!=0)
			{
				ld=num%10;
				sum=sum+ld;
				num=num/10;
			}
			num=temp;
			//System.out.println(sum);
			int count=0;
			for (int j=1;j<=sum;j++)
			{
				if (sum%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(sum+" is prime");
			}
			else
			{
				System.out.println(sum+" is not prime");
			}
		}
		
	}
}
