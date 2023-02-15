package array;

public class SumOfArray 
{
	public static void main(String[] args)
	{
		int a[] = {10,20};
		int sum=0;
		for (int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		double average = sum/a.length;
		System.out.println(average);
	}
}
