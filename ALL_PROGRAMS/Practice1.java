import java.util.Scanner;
class  Practice1
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first value");
		int n1 = scan.nextInt();
		System.out.println("enter second value");
		int n2 = scan.nextInt();
		System.out.println("the sum of "+n1+ " and " +n2+ " is: "+(n1+n2));
	}
}
