import java.util.Scanner;
class User_name_20
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("enter your name");
		String name = scan.next();
		
		for (int a=1;a<=20 ;a++ )
		{
			System.out.println(a+") "+name);
		}
	}
}
