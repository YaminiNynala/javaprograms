import java.util.Scanner;
class Practice9
{
	public static void main (String[] angs)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter division number");
		int d_no = scan.nextInt();
		if (d_no==1)
		{
			System.out.println("your division name is east");
		}
		else if (d_no==2)
		{
			System.out.println("your division name is west");
		}
		else if (d_no==3)
		{
			System.out.println("your division name is north");
		}
		else if (d_no==4)
		{
			System.out.println("your division name is south");
		}
		else if (d_no==5)
		{
			System.out.println("your division name is north-east");
		}
		else
		{
			System.out.println("Enter the valid input");
		}
	}
}