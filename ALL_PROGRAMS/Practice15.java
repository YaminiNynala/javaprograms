import java.util.Scanner;
class Practice15
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter month number");
		int month_number = scan.nextInt();
		switch (month_number)
		{
		case 3:case 4:case 5:System.out.println("summer season");
		break;
		case 6:case 7:case 8:System.out.println("rainy season");
		break;
		case 9:case 10:case 11:System.out.println("spring season");
		break;
		case 12:case 1:case 2:System.out.println("winter season");
		break;
		}
	}
}
