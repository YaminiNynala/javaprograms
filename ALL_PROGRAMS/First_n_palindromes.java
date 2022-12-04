import java.util.Scanner;
class First_n_palindromes 
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value to print first n palindromes");
		int n = scan.nextInt();
		int x = 1;
		int palindromecount = 1;
		while (palindromecount<=n)
		{
			int temp=x;
			int lastdigit=0;
			int rev=0;
			while (x!=0)
			{
				lastdigit = x%10;
				rev = rev*10+lastdigit;
				x=x/10;
			}
			x=temp;
			if (x==rev)
			{
				System.out.println(palindromecount+") "+x);
				palindromecount++;
			}
			x++;
		}
	}
}
