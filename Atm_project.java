import java.util.Scanner;
class Atm_project 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome!");
		System.out.println("Please enter your pin number:");
		int pin=1234;
		int pin_number= scan.nextInt();
		int balance=10000;
		if (pin==pin_number)
		{
			System.out.println("validation done");
			System.out.println();	
			System.out.println("enter 1 for balance enquiry");
		    System.out.println("enter 2 for mini statement");
			System.out.println("enter 3 for cash withdrawl");
		    System.out.println("enter 4 for pin change");
		    System.out.println("enter 5 for deposite");
			System.out.println("enter 6 for exit");
			int ch= scan.nextInt();
			if (ch==1)
			{
				System.out.println("Please enter your pin number:");
				int pin1=scan.nextInt();
				if (pin1==pin_number)
					{
					System.out.println("your available balance is:10000");
					}
					else
				    {
					System.out.println("Entered pin number is wrong please check it once");
					}
				
			}
			else if (ch==2)
			{
				System.out.println("Please enter your pin number:");
				int pin2=scan.nextInt();
				if (pin2==pin_number)
					{
				System.out.println("The last five Transactions are:");
				System.out.println("1 01-08-2022 UPIAB/218207163445/CR/MANDASU/PYTM/8309056943@ybl 60.00 946.36 Cr");
				System.out.println("2 16-08-2022 UPIAR/218301603926/DR/ONGOLEF/HDFC/ongolefoodcour 440.00 506.36 Cr");
				System.out.println("3 23-08-2022 630302010007597:Int.Pd:01-04-2022 to 30-06-2022 4.00 510.36 Cr");
				System.out.println("4 05-09-2022 630302010007597:Int.Pd:01-04-2022 to 30-06-2022 4.00 510.36 Cr");
				System.out.println("5 21-09-2022 630302010007597:Int.Pd:01-04-2022 to 30-06-2022 4.00 510.36 Cr");
					}
					else
				    {
					System.out.println("Entered pin number is wrong please check it once");
					}
			}
			else if (ch==3)
			{
				System.out.println("Enter the amount:");
				int withdrawl_amount=scan.nextInt();
				System.out.println("Please enter your pin number:");
				int pin3=scan.nextInt();
				if (pin3==pin_number)
					{
					System.out.println("transaction succesful");
					System.out.println();
				System.out.println("After withdrwaing the amount your available balance is:"+(balance-withdrawl_amount));
					}
					else
				    {
					System.out.println("Entered pin number is wrong please check it once");
					}
			}
			else if (ch==4)
			{
				System.out.println("Enter your current pin number:");
					if (pin==pin_number)
					{
					System.out.println("Enter new pin number:");
					System.out.println("your pin number is updated");
					}
					else
				    {
					System.out.println("Entered pin number is wrong please check it once");
					}
			}
			else if (ch==5)
			{
				
				System.out.println("Enter the amount:");
				int deposited_amount=scan.nextInt();
				System.out.println("Please enter your pin number:");
				int pin5=scan.nextInt();
				if (pin5==pin_number)
					{
					System.out.println("transaction succesful");
					System.out.println("After depositing the amount your available balance is:"+(balance+deposited_amount));
					}
					else
				    {
					System.out.println("Entered pin number is wrong please check it once");
					}
			}
			else if (ch==6)
			{
				System.out.println("exit");
			}
			else 
			{
				System.out.println("Enter a valid input");
			}
		}
		else
		{
			System.out.println("Enter the correct pin number");
		}
	}
}
