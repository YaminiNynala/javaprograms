package arrayObject;

public class IntegerArray_PrintLargestElement
{
	public static void main(String[] args)
	{
	int[] intArray= {125,50,15,1,0,25,73,75,85,500,-1};
	int largeElement = intArray[0];
	for(int i = 1; i<=intArray.length-1; i++)
	{
		if(largeElement < intArray[i])
		{
			largeElement = intArray[i];
		}
	}
	System.out.println("Largest Element present in the given Array is : "+largeElement);
}
}
