package arrayObject;

public class IntegerArray_SortAnArray
{
public static void main(String[] args) {
	int[] intArray = {11,12,17,19,88,99,125,130,1};
	int temp;
	System.out.println("The Sorted Array in Ascending Order is : ");
	for(int i = 0; i<=intArray.length-1; i++)
	{
		for(int j = i+1; j<=intArray.length-1; j++)
		{
			if(intArray[i] > intArray[j])
			{
			temp = intArray[i];
			intArray[i] = intArray[j];
			intArray[j] = temp;
			}
		}
	}
	for(int IntArray : intArray)
	{
		System.out.print(IntArray+" ");
	}
}
}
