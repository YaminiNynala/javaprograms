import java.util.Scanner;
class Sum_of_N_numbers_using_calculator 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int sum=0;
		for (int i=1;true ;i++ )
		{
			int num = scan.nextInt();
			char ch= scan.next().charAt(0);
			if (ch=='+')
			{
				sum=sum+num;
			}
			else if (ch=='=')
			{
				System.out.println("========");
				sum=sum+num;
				System.out.println(sum);
				break;
			}
		}
	}
}
