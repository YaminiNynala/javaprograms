import java.util.Scanner;
class  Season_name
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any month number");
		int month_number = scan.nextInt();
		switch (month_number)
		{
		case 3:case 4:case 5:System.out.println("Summer Season");
		break;
		case 6:case 7:case 8:System.out.println("Rainy Season");
		break;
		case 9:case 10:case 11:System.out.println("Spring Season");
		break;
		case 12:case 1:case 2:System.out.println("Winter Season");
		break;
        default : System.out.println("Enter valid input");
		}
	}
}