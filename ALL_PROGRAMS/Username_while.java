import java.util.Scanner;
class Username_while 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your name");
		String name = scan.next();

		int a = 1;
		while (a<=20)
		{
			System.out.println(a+") "+name);
			a++;

		}
	}
}
