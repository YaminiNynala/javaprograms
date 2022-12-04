import java.util.Scanner;
class Largest_of_two 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers one by one");
		int n1 =scan.nextInt();
		int n2 =scan.nextInt();
		int large = (n1>n2)?n1:n2;
		System.out.println("large number is "+large);
	}
}
