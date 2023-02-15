package arrayObject;

import java.util.Scanner;

public class IntegerArray_DivisibleBy3_5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the size of the Array Elements : ");
	int length = scan.nextInt();
	int[] intArray = new int[length];
	for(int i = 0; i<=intArray.length-1; i++)
	{
		System.out.print("Enter the Array Element at index : "+i);
	    intArray[i]=scan.nextInt();
	}
	System.out.println("The numbers which are divisible by 3 and 5 are:");
	for(int i = 0; i<=intArray.length-1; i++)
	{
		if(intArray[i]%3==0 && intArray[i]%5==0)
		{
			System.out.println(intArray[i]);
		}
	}
}
}
