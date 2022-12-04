import java.util.Scanner;
class  Product_of_three_numbers
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int n1 = scan.nextInt();
		System.out.println("Enter second number");
        int n2 = scan.nextInt();
		System.out.println("Enter third number");
        int n3 = scan.nextInt();
        System.out.println(n1*n2*n3);
	}
}
