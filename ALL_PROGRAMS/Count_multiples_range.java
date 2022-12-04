import java.util.Scanner;
class Count_multiples_range
{
	public static void main(String [] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter min number");
		int min = scan.nextInt();
		System.out.println("Enter max number");
		int max = scan.nextInt();
		System.out.println("Enter a number to count its multiples");
		int num = scan.nextInt();	
		int count=0;
		for (int a=min;a<=max;a++ )
		{
			if (a%num==0)
			{
				System.out.println(a);
				count++;
			}
		}
        System.out.println("Count of multiples of "+num+" from "+min+" to "+max+" is : "+count);
	}
}
