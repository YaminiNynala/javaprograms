package array;

public class DuplicateElementInArray {

	public static void main(String[] args)
	{
		int a[] = {1,1,2,2,3,3,4,4,5,6,78,7};
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=i+1;j<=a.length-1;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}

}
