package arrayObject;

public class IntegerArray_PrintCountEvenElements
{
public static void main(String[] args) {
	int[] intArray = {10,11,12,13,14,15,16,17,18};
	int count = 0;
	System.out.println("From the given Array Even Elements are...");
	for(int i = 0; i<=intArray.length-1; i++)
	{
		if(intArray[i]%2 == 0)
		{
			count++;
			System.out.print(intArray[i]+" ");
		}
	}
	System.out.println();
	System.out.println("The number of Even Elements present in given Array is : "+count);
}
}
