import java.util.Scanner;
class  Obtained_result2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade = scan.next().charAt(0);
		if (grade=='A'||grade=='a')
		{
			System.out.println("you got first rank");
		}
		else if (grade=='B'|| grade=='b')
		{
			System.out.println("you got second rank");
		}
		else if (grade=='C'|| grade=='c')
		{
			System.out.println("you got first class");
		}
		else if (grade=='D'|| grade=='d')
		{
			System.out.println("you got second class");
		}
		else if (grade=='E'|| grade=='e')
		{
			System.out.println("you passed the exam");
		}
		else if (grade=='F'|| grade=='f')
		{
			System.out.println("you failed in the exam");
		}
		else 
		{
			System.out.println("Enter the valid input");
		}
	}
}

