import java.util.Scanner;
class First_n_terms_in_fibonacci_series 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value to get first n fibonacci terms");
		int n = scan.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			System.out.println(sum);
			a=b;   //b value is given to a
			b=sum; // sum value is given to b
            sum=a+b;
		}
	}
}
