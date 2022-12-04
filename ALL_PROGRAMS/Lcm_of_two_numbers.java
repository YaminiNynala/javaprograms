import java.util.Scanner;
class Lcm_of_two_numbers 
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
		
	    int lcm=a>b?a:b;
	    while (true)
	    {
			if (lcm%a==0 && lcm%b==0)
			{			
                System.out.println("the lcm of "+a+ " and "+b+" is "+lcm);
				break;
			}
			lcm++;
	    }
		
		
	}
}

