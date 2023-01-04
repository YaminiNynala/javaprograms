package arrayObject;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {56,34,89,45,12};
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				int n=a[i];
				if (a[i]<a[j])
				{
					a[i]=a[j];
					a[j]=n;
				}
			}
		}
		System.out.println("After Sorting: ");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
