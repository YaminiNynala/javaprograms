import java.util.Scanner;
class  Multiplication_table_inGivenManner
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter multiplication table number");
		int num = scan.nextInt();
		for (int a=1;a<=10 ;a++ )
		{
			System.out.println(num+"*"+a+"="+(num*a));
		}
	}
}

