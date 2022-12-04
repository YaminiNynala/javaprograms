import java.util.Scanner;
class Nth_palaindrome 
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter nth value to get nth palindrome");
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
				if (palindromecount==n)
				{
					System.out.println(palindromecount+") "+x);
				}
				palindromecount++;
			}
			x++;
		}
	}
}