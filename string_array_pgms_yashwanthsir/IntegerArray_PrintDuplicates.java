package arrayObject;

public class IntegerArray_PrintDuplicates
{
public static void main(String[] args) {
	int[] intArray = {1,1,2,2,3,4,5,5,6,7,8,9,10,10};
	System.out.println("The duplicated elements in the given array are");
	for(int i = 0; i<=intArray.length-1; i++)
	{
		for(int j = i+1; j<=intArray.length-1; j++)
		{
			if(intArray[i] == intArray[j])
			{
				System.out.print(intArray[i]+" ");
			}
		}
	}
}
}		