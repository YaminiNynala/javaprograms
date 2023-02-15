package array;
import java.util.Scanner;
public class DoubleArrayObject
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int size = scan.nextInt();//Size from user
		//declaration
		double[] studentMarks = new double[size];
		//initialization
		for (int i=0;i<=size-1;i++)
		{
			System.out.println("Enter the "+(i+1)+" student marks: ");
			studentMarks[i] = scan.nextDouble();
		}
		//utilization
		for (int i=0;i<=size-1;i++)
		{
			System.out.println((i+1)+" Student marks: "+studentMarks[i]);
		}
	}
}
