package array;
import java.util.Scanner;
public class StringArrayObject
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String [] subjectName = new String[4];
		for (int i=0;i<=4-1;i++)
		{
			System.out.println("Enter the "+(i+1)+" subject name: ");
			subjectName [i] = scan.next();
		}
		for (int i=0;i<=4-1;i++)
		{
			System.out.println((i+1)+" Subject Name : "+subjectName[i]);
		}
		
	}
}
