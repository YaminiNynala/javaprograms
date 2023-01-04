package arrayObject;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6,3,4,7,8,8};
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}

}
