import java.util.Scanner;
class Sum_of_N_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("how many numbers you want to add: ");
		int n = scan.nextInt();
		int sum =0;
		for (int i=1;i<=n ;i++ )
		{
			System.out.println("Enter number"+i);
			int num=scan.nextInt();
			sum=sum+num;
		}
		System.out.println(sum);
	}
}
