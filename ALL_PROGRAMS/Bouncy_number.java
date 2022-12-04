import java.util.Scanner;
class Bouncy_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number you want to check");
		int num = scan.nextInt();
		boolean inc = true;
		boolean dec = true;
		int temp = num;
		int oldlastdigit = num%10;
		num = num/10;
		while (num!=0)
		{
			int newlastdigit = num%10;
			if (newlastdigit>oldlastdigit)
			{
				oldlastdigit = newlastdigit;
			}
			else
			{
				dec = false;
			}
			num = num/10;
		}
		num = temp;
		while (num!=0)
		{
			int newlastdigit = num%10;
			if (newlastdigit<oldlastdigit)
			{
				oldlastdigit = newlastdigit;
			}
			else
			{
				inc = false;
			}
			num = num/10;
		}
		if (dec==true||inc==true)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes");
		}
	}
}
