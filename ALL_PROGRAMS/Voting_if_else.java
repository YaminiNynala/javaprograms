import java.util.Scanner;
class Voting_if_else 
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("enter age");
		int age = scan.nextInt();
		
		if (age>=18)
		{
             System.out.println("eligible");
		}
		else
			System.out.println("not eligible");
	}
}
