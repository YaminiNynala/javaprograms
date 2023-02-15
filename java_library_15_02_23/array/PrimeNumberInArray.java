package array;

public class PrimeNumberInArray 
{
	public static void main(String[] args) 
	{
		int a[] = {2,3,5,7,4,6,11,45,9,13,13,14,17};		
		for(int i=0;i<=a.length-1;i++)
		{
			int count=0;
			for(int j=1;j<=a[i];j++)
			{
				if (a[i]%j==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(a[i]);
			}
		}
	}
}
