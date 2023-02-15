
package arrayObject;

import java.util.Scanner;

public class IntegerArray_Reverse
{
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the size of Array Elements : ");
	int size = scan.nextInt();
	int[] intArray = new int[size];
	for(int i = 0; i<=intArray.length-1; i++)
	{
		System.out.print("Enter the Array Element at index : "+i);
	    intArray[i]=scan.nextInt();
	}
	System.out.println("The Reversed Array Elements from the Given Array are...");
	for(int i = intArray.length-1; i>=0; i--)
	{
		System.out.print(intArray[i]+" ");
	}
}	
}