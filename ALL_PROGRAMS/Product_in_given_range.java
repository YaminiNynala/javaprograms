import java.util.Scanner;
class  Product_in_given_range
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter min range");
		int min = scan.nextInt();
		System.out.println("enter max range");
		int max = scan.nextInt();		
		int product=1;
		for (int a=min;a<=max ;a++ )
		{
			product=product*a;
		}
		System.out.println("product of natural numbers from "+min+" to "+max+" is: "+product);
	}
}
