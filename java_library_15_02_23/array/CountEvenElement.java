package array;

public class CountEvenElement 
{
	public static void main(String[] args)
	{
		int a[] = {23,34,56,45,66,78,25,22};
		int count=0;
		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println("Count of even numbers: "+count);
	}

}
