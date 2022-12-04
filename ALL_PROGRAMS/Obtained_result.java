import java.util.Scanner;
class  Obtained_result
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade in capital letters");
		char grade = scan.next().charAt(0);
		if (grade=='A')
		{
			System.out.println("you got first rank");
		}
		else if (grade=='B')
		{
			System.out.println("you got second rank");
		}
		else if (grade=='C')
		{
			System.out.println("you got first class");
		}
		else if (grade=='D')
		{
			System.out.println("you got second class");
		}
		else if (grade=='E')
		{
			System.out.println("you are just pass");
		}
		else if (grade=='F')
		{
			System.out.println("you are fail");
		}
		else 
		{
			System.out.println("Enter the valid input");
		}
	}
}
