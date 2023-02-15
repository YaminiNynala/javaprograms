package arrayObject;

public class IntegerArray_SumOfAllElements
{
public static void main(String[] args) {
	int[] intArray = {2,3,7,9,10,12,15};
	int sum = 0;
	for(int i = 0; i<=intArray.length-1; i++)
	{
		sum = sum + intArray[i];
	}
	System.out.println("The Sum of all Elements present in the Array is : "+sum);
}
}