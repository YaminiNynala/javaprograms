import java.util.Scanner;
class Combination 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scan.nextInt();
		System.out.println("Enter r value");
		int r = scan.nextInt();
		int factorial1=1;             
		for (int a=1;a<=n ;a++ )
		{
			factorial1=factorial1*a;
		}
		int factorial2=1;
		for (int a=1;a<=n-r ;a++ )
		{
			factorial2=factorial2*a;
		}
        int factorial3=1;
		for (int a=1;a<=r ;a++ )
		{
			factorial3=factorial3*a;
		}

        //formula : ncr=n!/n!(n-r)!

		int result = factorial1/(factorial3*factorial2);
		System.out.println(result);
	}
}
