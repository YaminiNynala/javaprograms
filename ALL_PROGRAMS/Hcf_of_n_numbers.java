import java.util.Scanner;
class Hcf_of_n_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to get hcf");
		int n = scan.nextInt();
		int hcf=0;
		int temp=0;
		for (int a=1;a<=n ;a++ )
		{
			System.out.println("Enter number"+a);
			int num = scan.nextInt();
			if (a==1)
			{
				hcf = num;
			}
			for (int i=1;i<=temp ;i++ )
			{
				if (temp%i==0 && num%i==0)
				{
					hcf = i;
				}
			}
			temp = hcf;
		}
		System.out.println("HCF of given numbers is "+hcf); 
	}
}
