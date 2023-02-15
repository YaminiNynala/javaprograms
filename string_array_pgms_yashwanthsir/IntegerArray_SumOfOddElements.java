package arrayObject;

public class IntegerArray_SumOfOddElements
{
public static void main(String[] args) {
	int[] intArray = {2,3,7,9,10,12,15};
	int sum =0;
	for(int i = 0; i<= intArray.length-1;i++)
	{
	if (intArray[i]%2!=0)
	{
		sum =sum +intArray[i];
	}
	}
	System.out.println("The Sum of Odd Elements present in the given Array is : "+sum);
}
}