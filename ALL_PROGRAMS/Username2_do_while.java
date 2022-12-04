import java.util.Scanner;
class  Username2_do_while
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		String name = scan.next();
        System.out.println("how many times it should be printed");
		int num = scan.nextInt();

		int a=1;
		do
		{
			System.out.println(a+") "+name);
			a++;
		}
		while (a<=num);
	}
}
