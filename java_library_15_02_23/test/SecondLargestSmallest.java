package test;

public class SecondLargestSmallest 
{
	public static void main(String[] args) 
	{
		int a[] = {1,5,3,7,2,9,67};//1 2 3 5 7 9
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
		}
		System.out.println("Second smallest:"+a[1]);
		System.out.println("Second largest:"+a[a.length-2]);
		
	}
}
