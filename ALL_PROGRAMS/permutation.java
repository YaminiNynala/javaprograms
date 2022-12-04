import java.util.Scanner;
class permutation 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = scan.nextInt();
		System.out.println("Enter r value");
		int r = scan.nextInt();
		int permutation=1;
        for (int a=n;a>n-r;a--)
		{
			permutation=permutation*a;
		}  
		System.out.println(permutation);
	}
}
