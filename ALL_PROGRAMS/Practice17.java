import java.util.Scanner;
class Practice17 
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
