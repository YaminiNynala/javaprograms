import java.util.Scanner;
class Perfect_number
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check it is perfect are not");
		int num = scan.nextInt();
		
		int sum=0;
		for (int a=1;a<num ;a++ )
		{
			if (num%a==0)
			{
				sum=sum+a;
			}
		}
		if (sum==num)
		{
			System.out.println(num+ " is a perfect number");
		}
		else 
		{
			System.out.println(num+" is not a perfect number");
		}
	}
}
