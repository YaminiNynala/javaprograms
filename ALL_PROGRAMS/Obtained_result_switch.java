import java.util.Scanner;
class  Obtained_result_switch
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade = scan.next().charAt(0);
		switch (grade)
		{
		case 'A':case 'a':System.out.println("you got first rank");
		break;
		case 'B':case 'b':System.out.println("you got second rank");
		break;
		case 'C':case 'c':System.out.println("you got first class");
		break;
		case 'D':case 'd':System.out.println("you got second class");
        break;
		case 'E':case 'e':System.out.println("you passed the exam");
		break;
		case 'F':case 'f':System.out.println("you failed in the exam");
		break;
        default : System.out.println("Enter valid input");
		}
	}
}
