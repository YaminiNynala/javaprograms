import java.util.Scanner;
class Username2_while 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.next();
        System.out.println("how many times it should be printed");
		int num = scan.nextInt();

		int a = 1;
		while (a<=num)
		{
			System.out.println(a+") "+name);
			a++;
		}
	}
}
