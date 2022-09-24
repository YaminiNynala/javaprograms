import java.util.Scanner;
class Hcf_2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = scan.nextInt();
		System.out.println("Enter second number");
		int n2 = scan.nextInt();
		
		while (n2>0)
		{
			int temp = n2;
			n2 = n1%n2;
			n1 = temp;
		}
		System.out.println("Hcf is: "+n1);
	}
}
