import java.util.Scanner;
class  Avg_of_5_numbers
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
		System.out.println("Enter 4 number");
		int n4 = scan.nextInt();
		System.out.println("Enter 5 number");
        int n5 = scan.nextInt();
		double avg = (n1+n2+n3+n4+n5)/5.0;
		System.out.println("avg of"+n1+","+n2+","+n3+","+n4+"and"+n5+"is : " +avg);
	}
}
