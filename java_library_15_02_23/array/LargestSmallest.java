package array;

public class LargestSmallest 
{
	public static void main(String[] args) 
	{
		int a[]= {12,45,34,56,78,89};
		int small=a[0];
		int large=a[0];
		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i]<small)
			{
				small=a[i];
			}
			if (a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println(small);
		System.out.println(large);
	}
}
