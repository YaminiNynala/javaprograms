import java.util.Scanner;
class Hcf_of_two_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to get hcf of two numbers");
		System.out.println();
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
	    int hcf=0;
	    for (int i=1;i<=a ;i++ )
	    {
			if (a%i==0 && b%i==0)
			{
				hcf=i;
			}
	    }
		System.out.println("the hcf of "+a+ " and "+b+" is "+hcf);
	}
}
