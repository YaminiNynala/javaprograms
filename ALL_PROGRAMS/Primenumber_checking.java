import java.util.Scanner;
class  Primenumber_checking
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to check it is prime or not");
		int num = scan.nextInt();
		int count =0;
        for (int a=1;a<=num ;a++ )
        {
			if (num%a==0)
			{			
				count++;
			}
        }
		if (count==2)
		{
			System.out.println(num+"is a prime number");
		}
		else
		{
			System.out.println(num+"is not a prime number");
		}
	}
}
