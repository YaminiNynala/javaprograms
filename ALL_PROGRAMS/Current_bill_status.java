import java.util.Scanner;
class Final_bill_payable 
{
	public static void main(String[] args) 
	{
	    Scanner scan = new Scanner(System.in);
		System.out.println("enter current bill amount");
		int bill = scan.nextInt();
		double dis25 = (bill*0.75);
        double dis10 = (bill*0.90);
		if (bill>5000)
		{
            
			System.out.println("bill payable is "+dis25);
		}
		else
			System.out.println("bill payable is "+dis10);
	}
}