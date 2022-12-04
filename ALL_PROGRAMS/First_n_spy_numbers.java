import java.util.Scanner;
class First_n_spy_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value to print n spy numbers");
		int n = scan.nextInt();
		int x=1;
		int spycount=1;
		
		while (spycount<=n)
		{
			int temp = x;
			int sum=0;
			int product=1;
			int lastdigit=0;
            while (x!=0)
            {
				lastdigit=x%10;
				sum=sum+lastdigit;
				product=product*lastdigit;
				x=x/10;
            }
			x=temp;
			if (sum==product)
			{
				System.out.println(x);
				spycount++;
			}
			x++;
		}
	}
}
