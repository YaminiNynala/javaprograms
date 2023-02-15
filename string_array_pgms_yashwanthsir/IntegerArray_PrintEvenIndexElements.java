package arrayObject;

public class IntegerArray_PrintEvenIndexElements
{
 public static void main(String[] args) {
	 int[] intArray= {1,2,3,4,5,6,7,8};
	 System.out.println("Elements that are present in Even Index Positions are: ");
	 for(int i=0; i<intArray.length; i++)
	 {
		 if(i%2 == 0)
		 {
			 System.out.print(intArray[i]+" ");
		 }
	 }
}
}
