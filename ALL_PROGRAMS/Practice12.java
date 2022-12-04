import java.util.Scanner;
class  Practice12
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter direction number");
		int Dnum = scan.nextInt();
		switch (Dnum)
		{
		case 1:System.out.println("east");
		break;
		case 2:System.out.println("west");
		break;
		case 3:System.out.println("north");
		break;
		case 4:System.out.println("south");
		break;
		default : System.out.println("evip");
		
		}

	    
	}
}
