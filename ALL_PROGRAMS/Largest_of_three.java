import java.util.Scanner;
class Largest_of_three 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter three numbers one by one");
		int n1 =scan.nextInt();
		int n2 =scan.nextInt();
        int n3 =scan.nextInt();
		int large = (n1>n2&&n1>n3)?n1:(n2>n3)?n2:n3;
		System.out.println("large number is"+large);
	}
}
