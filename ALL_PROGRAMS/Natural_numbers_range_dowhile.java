import java.util.Scanner;
class  Natural_numbers_range_dowhile
{
	public static void main(String[] args) 
	{
		Scanner yamini = new Scanner(System.in);
		System.out.println("enter minimum range");
		int min = yamini.nextInt();
        System.out.println("enter maximum range");
        int max = yamini .nextInt();

		int a=min;
		do
		{
			System.out.println(a);
			a++;
		}
		while (a<=max);
	}
}
