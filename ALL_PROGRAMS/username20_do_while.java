import java.util.Scanner;
class  username20_do_while
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		String name = scan.next();
        
		int a=1;
		do
		{
			System.out.println(a+") "+name);
			a++;
		}
		while (a<=20);
	}
}
