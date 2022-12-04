import java.util.Scanner;
class Magic_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is magic number or not");
		int num = scan.nextInt();
		if (num%9==1)
		{
			System.out.println("magic number");
		}
		else
		{
			System.out.println("not magic number");
		}
	}
}
