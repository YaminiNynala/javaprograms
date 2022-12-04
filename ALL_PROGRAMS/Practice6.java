import java.util.Scanner;
class  Practice6
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = scan.nextInt();
		if (age>=21 && age<=32)
		{
			System.out.println("you are eligible for writing IAS exam");
		}
		else
        {
			System.out.println("you are not eligible for writing IAS exam");
		}
	}
}
