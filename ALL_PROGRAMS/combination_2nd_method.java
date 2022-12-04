import java.util.Scanner;
class combination_2nd_method 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scan.nextInt();
		System.out.println("Enter r value");
		int r = scan.nextInt();
		int permutation=1;
        for (int a=n;a>n-r;a--)
		{
			permutation=permutation*a;
		}  

		//formula : ncr=n!/n!(n-r)!

		int fact_r=1;
		for (int a=1;a<=r ;a++ )
		{
			fact_r=fact_r*a;
		}
		System.out.println(permutation/fact_r);
	}
}
