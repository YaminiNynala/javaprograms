import java.util.Scanner;
class largest_of_4 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter four numbers one by one");
		int n1 =scan.nextInt();
		int n2 =scan.nextInt();
        int n3 =scan.nextInt();
		int n4 =scan.nextInt();
		int large = (n1>n2&&n1>n3&&n1>n4)?n1:(n2>n3&&n2>n4)?n2:(n3>n4)?n3:n4;
		System.out.println("large number is "+large);

	}
}
