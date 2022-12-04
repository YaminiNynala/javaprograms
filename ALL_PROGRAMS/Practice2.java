import java.util.Scanner;
class  Practice2
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first value");
		int n1 = scan.nextInt();
		System.out.println("enter second value");
		int n2 = scan.nextInt();
		System.out.println("enter third value");
		int n3 = scan.nextInt();
		System.out.println("the product of "+n1+", "+n2+" and " +n3+" is: "+(n1*n2*n3));
	}
}
