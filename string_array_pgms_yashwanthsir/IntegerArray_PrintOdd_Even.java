package arrayObject;

public class IntegerArray_PrintOdd_Even
{
public static void main(String[] args) {
	int[] intArray = {11,88,90,0,1,25,27,38,48,50,100,111,-1};
	System.out.println("Odd Element present in given Array : ");
	for(int i = 0; i < intArray.length; i++)
	{
		if(intArray[i]%2 != 0)
		{
			System.out.print(intArray[i] + " ");
		}
	}
	System.out.println();
	System.out.println("Even Element present in given Array : ");
	for(int i = 0; i < intArray.length; i++)
	{
		if(intArray[i]%2 == 0)
		{
			System.out.print(intArray[i] + " ");
		}
	}
}
}
