import java.util.Scanner;
class  Sum_in_given_range
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter min range");
		int min = scan.nextInt();
		System.out.println("enter max range");
		int max = scan.nextInt();		
		int sum=0;
		for (int a=min;a<=max ;a++ )
		{
			sum=sum+a;
		}
		System.out.println("Sum of natural numbers from"+min+" to "+max+" is: "+sum);
	}
}
