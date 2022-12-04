import java.util.Scanner;
class  Park_entry_fees
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your category");
		String category = scan.next();
		switch (category)
		{
		case "male":System.out.println("Entry fees is: 100 Rs");
		break;
		case "female":System.out.println("Entry fees is: 80 Rs");
		break;
		case "transgender":System.out.println("Entry fees is: 20 Rs");
		break;
		case "children":System.out.println("Entry fees is: 5 Rs");
        break;
		case "Senior_citizen":System.out.println("Entry fees is: 0 Rs");
		break;
        default : System.out.println("Enter valid input");
		}
	}
}
