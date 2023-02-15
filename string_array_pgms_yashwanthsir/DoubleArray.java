package arrayObject;

public class DoubleArray
{
public static void main(String[] args) {
	double[] doubleArray = new double[5];
	doubleArray[0] = 5.6;
	doubleArray[1] = 3.4;
	doubleArray[2] = 4.2;
	doubleArray[3] = 2.2;
	doubleArray[4] = 6.5;
	for(int i = 0; i<=doubleArray.length-1; i++)
	{
		System.out.println(doubleArray[i]);
	}
System.out.println("The length of the given Array is : "+doubleArray.length);
}
}