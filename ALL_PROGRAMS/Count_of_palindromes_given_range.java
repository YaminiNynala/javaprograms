import java.util.Scanner;
class Count_of_palindromes_given_range 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minimum range");
		int min = scan.nextInt();
        System.out.println("Enter maximum range");
		int max = scan.nextInt();
		int count=0;
        for (int i=min;i<=max ;i++ )
        {
			int temp = i;
			int lastdigit=0;
			int reverse=0;
			while (i!=0)
			{
				lastdigit=i%10;
				reverse=reverse*10+lastdigit;
				i=i/10;
			}
			i=temp;
			if (temp==reverse)
			{
				System.out.println(temp);
				count++;
			}
        }
		System.out.println();
		System.out.println("the count of palindromes from "+min+" to "+max+" are "+count);
	}
}