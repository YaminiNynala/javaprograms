import java.util.Scanner;
class Eligible_for_ias 
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("enter age");
		int age = scan.nextInt();
		
		if (age>=21 && age<=32)
		{
             System.out.println("eligible for IAS");
		}
		else
			System.out.println("not eligible for IAS");
	}
}
