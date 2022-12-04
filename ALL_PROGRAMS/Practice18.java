import java.util.Scanner;
class  Practice18
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		String name = scan.next();
        System.out.println("how many times it should be printed");
		int num = scan.nextInt();
		for (int a=1;a<=num ;a++ )
		{
			System.out.println(a+") "+name);
		}
		
	}
}
