package arrayObject;

public class IntegerArray_PrintOccurence
{
public static void main(String[] args) {
	int[] intArray = {1,1,1,2,2,3,4,5,6,6,7,7,7,8};
	for(int i = 0; i<=intArray.length-1; i++)
	{
		int count = 0;
		for(int j = i+1; j<=intArray.length-1; j++)
		{
			if(intArray[i] == intArray[j])
			{
				count++;
			}
		} 
		i = i + count;
		System.out.println(intArray[i]+" is occured for "+count+" time(s) again in an Array");
	}	
}
}