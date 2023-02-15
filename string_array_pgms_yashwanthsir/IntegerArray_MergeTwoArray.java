package arrayObject;

public class IntegerArray_MergeTwoArray
{
public static void main(String[] args) {
	int[] firstArray = {1,3,5,7,9};
	int[] secondArray = {2,4,6,8,10};
	int[] thirdArray = new int[firstArray.length + secondArray.length];
	
	for(int i = 0; i<=firstArray.length-1; i++)
	{
		thirdArray[i] = firstArray[i];
	}
	int continueIndexNumber = firstArray.length;
	for(int i = 0; i<=secondArray.length-1; i++)
	{
		thirdArray[continueIndexNumber] = secondArray[i];
		continueIndexNumber++;
	}
	System.out.println("The Merged Array from the given Array is...");
	for(int ThirdArray : thirdArray)
	{
		System.out.print(ThirdArray+" ");
	}
}
}
