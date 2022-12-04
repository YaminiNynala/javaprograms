import java.util.Scanner;
class  Practice10
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your grade:");
		char grade = scan.next().charAt(0);
		if (grade=='A'||grade=='a')
		{
			System.out.println("you secured first rank");
		}
		else if (grade=='B'||grade=='b')
		{
			System.out.println("You secured second rank");
		}
		else if (grade=='C'||grade=='c')
		{
			System.out.println("You secured first class");
		}
		else if (grade=='D'||grade=='d')
		{
			System.out.println("You secured second class");
		}
		else if (grade=='E'||grade=='e')
		{
			System.out.println("You passed the exam");
		}
		else if (grade=='F'||grade=='f')
		{
			System.out.println("You failed the exam");
		}
	    else 
		{
			System.out.println("enter valid input");
		}
	}
}
