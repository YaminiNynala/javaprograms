package arrayObject;

public class IntegerArray_PrintSmallestElement
{
public static void main(String[] args) {
	int[] intArray = {125,50,15,1,0,25,73,75,85,500,-1};
	int smallElement = intArray[0];
	for(int i = 1; i<=intArray.length-1; i++)
	{
		if(smallElement > intArray[i])
		{
			smallElement = intArray[i];
		}
	}
	System.out.println("The Smallest Element present in the given Array is : "+smallElement);
}
}
