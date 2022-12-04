import java.util.Scanner;
class Count_the_factors 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to count its factors");
		int num = scan.nextInt();
		int count=0;
		for (int a= 1;a<=num ;a++ )
		{
			if (num%a==0)
			{
				System.out.println(a);
				count++;
			}
		}
		System.out.println("Count of factors of "+num+" is : "+count);
	}
}
