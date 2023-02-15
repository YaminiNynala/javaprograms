package arrayObject;

public class IntegerArray_SecondLargestElement
{
public static void main(String[] args) {
	int[] intArray = {125,50,75,85,88,90,500,1,0,78,12,11,10,-1};
	int largeElement = intArray[0];
	int secondLargeElement = intArray[1];
	for(int i = 0; i<=intArray.length-1; i++)
	{
		if(largeElement < intArray[i])
		{
			largeElement = intArray[i];
		}
	}
	for(int i = 0; i<=intArray.length-1; i++)
	{
if(secondLargeElement < intArray[i] && largeElement != intArray[i])
		{
			secondLargeElement = intArray[i];
		}
	}
	System.out.println("The First Largest Element is : "+largeElement);
	System.out.println("The Second Largest Element is : "+secondLargeElement );
}
}
