package arrayObject;

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,5,45,67,-34,-2,56};
		int small=a[0];
		int large=a[0];
		for (int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				small=a[i];
			}
			if(a[i]>large)
			{
				large=a[i];
			}
		}
		System.out.println("Small number is: "+small);
		System.out.println("Large number is: "+large);
	}

}
