import java.util.Scanner;
class Lcm_2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to get lcm of two numbers");
		System.out.println();
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		int lcm =0;
		for (int i=a;i<=a*b ;i++ )
		{
			if (i%a==0 && i%b==0)
			{
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);
	}
}
