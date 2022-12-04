import java.util.Scanner;
class Final_bill_payable 
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("enter current bill amount");
		double bill = scan.nextInt();
		
		if (bill>5000)
		{
			System.out.println("bill payable is "+bill*0.75);
		}
		else
			System.out.println("bill payable is "+bill*0.90);
	}
}