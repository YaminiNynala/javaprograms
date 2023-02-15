package array;

public class SortingAnArray 
{
	public static void main(String[] args)
	{
		int a[] = {2,45,67,34,12};
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=i+1;j<=a.length-1;j++)
			{
				int temp=a[i];
				if (a[i]>a[j])
				{
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print("After sorting:");
			for (int j=0;j<=a.length;i++)
			{
				System.out.print(a[i]+ " ");
			}
		}
	}

}
