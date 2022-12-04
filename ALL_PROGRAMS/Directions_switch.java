import java.util.Scanner;
class Directions_switch 
{
	public static void main(String[] args)  
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter direction number:");
		int Dnum = scan.nextInt();
		switch (Dnum)
		{
		case 1:System.out.println("East");
		break;
		case 2:System.out.println("West");
		break;
		case 3:System.out.println("North");
		break;
		case 4:System.out.println("South");
		break;
		default:System.out.println("Enter valid input");
		
		}
	}
}
