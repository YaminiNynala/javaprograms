import java.util.Scanner;
class  Practice14
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your category");
		String category = scan.next();
		switch (category)
		{
		case "male":System.out.println("entry fees is 100 rs");
		break;
		case "female":System.out.println("entry fees is 80 rs");
		break;
		case "transgender":System.out.println("entry fees is 20 rs");
		break;
		case "children":System.out.println("entry fees is 5 rs");
		break;
		case "senior_citizen":System.out.println("entry fees is 0 rs");
		break;
		default: System.out.println("enter a valid input");
		}
	}
}
