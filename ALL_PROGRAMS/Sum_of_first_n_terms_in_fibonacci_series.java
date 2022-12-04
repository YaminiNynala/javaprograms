import java.util.Scanner;
class Sum_of_first_n_terms_in_fibonacci_series 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value to get sum");
		int n = scan.nextInt();
		int total=0;
		int a=0;
	    int b=1;
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			total=sum+total; //we have to write the total value at top side
			a=b;
			b=sum;
			sum=a+b;
			//if we write the total here it gets updated the value and gets wrong answer
		}
		
		System.out.println("The sum of first "+n+" terms is "+total);
	}
}
