import java.util.Scanner;
class Sum_of_two_numbers
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first value");
		int n1 = scan.nextInt();
		System.out.println("enter the second value");
		int n2 = scan.nextInt();
		System.out.println("sum of "+n1+" and "+n2+" is: "+(n1+n2));
	}
}
