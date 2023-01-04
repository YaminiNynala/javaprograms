package arrayObject;

public class EvenElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,23,45,66,2,78};
		int count=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
				count++;
			}
		}
		System.out.println("Count of even elements: "+count);
	}

}
