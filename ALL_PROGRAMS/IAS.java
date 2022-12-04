import java.util.Scanner;
class  IAS 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter age");
		int age = scan.nextInt();
		if (age>=21 && age<=32)
		{
			System.out.println("eligible for exam");
		}
		else
        {
			System.out.println("Not eligible for exam");
		}
	}
}
