import java.util.Scanner;
class Lcm_of_n_numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many numbers you want to get lcm");
		int n = scan.nextInt();
		int lcm=0;
		int temp=0;
		for (int a=1;a<=n ;a++ )
		{
			System.out.println("Enter number"+a);
			int num = scan.nextInt();
			if (a==1)
			{
				lcm = num;
			}
			for (int i=a;i<=temp*num ;i++ )
			{
				if (i%temp==0 && i%num==0)
				{
					lcm = i;
					break;
				}
			}
			temp = lcm;
		}
		System.out.println("LCM of given numbers is "+lcm); 
	}
}
