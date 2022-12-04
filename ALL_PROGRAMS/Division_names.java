import java.util.Scanner;
class Division_names 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your division number");
		int D_no = scan.nextInt();
		if (D_no==1)
		{
			System.out.println("Your division name is :- east division");
		}
		else if (D_no==2)
		{
			System.out.println("Your division name is :- west division");
		}
        else if (D_no==3)
		{
			System.out.println("Your division name is :- north division");
		}
		else if (D_no==4)
		{
			System.out.println("Your division name is :- South division");
		}
		else if (D_no==5)
		{
			System.out.println("Your division name is :- northeast division");
		}
		else 
		{
			System.out.println("enter the valid input");
		}
	}
}
