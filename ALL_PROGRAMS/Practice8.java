import java.util.Scanner;
class  Practice8
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your bill amount");
		double bill = scan.nextDouble();
		if (bill>=5000)
		{
			System.out.println("Final payable bill is: "+(bill*0.75));
		}
		else
		{
			System.out.println("Final payable bill is: "+(bill*0.90));
		}
	}
}
