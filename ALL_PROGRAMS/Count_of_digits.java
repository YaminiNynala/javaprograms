import java.util.Scanner;
class Count_of_digits 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get count of its digits");
		int num = scan.nextInt();
		int count=0;
		while (num>0)
		{
			count++;
			num=num/10;
		}		
		System.out.println(count);
	}
}
