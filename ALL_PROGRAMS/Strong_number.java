import java.util.Scanner;
class Strong_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a strong number or not");
		int num = scan.nextInt();
		int sum=0;
		int lastdigit=0;
		int temp = num; 
		while (num!=0)
		{
			lastdigit=num%10;
			int factorial=1;
			for (int a=1;a<=lastdigit ;a++ )//finding the factorial of digit
			{
				factorial=factorial*a;
			}
            sum=sum+factorial;
			num=num/10;
		}
		num=temp;
		//number becomes zero so we are taking temp 
		if (sum==num)
		{
			System.out.println(num+" is strong number");
		}
		else
		{
			System.out.println(num+" is not a strong number");
		}
	}
}
