package arrayObject;

public class PrimeNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a[]= {1,2,3,4,5,7,11};
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			for (int j=1;j<=a[i];j++)
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
			count=0;
		}
	}

}
