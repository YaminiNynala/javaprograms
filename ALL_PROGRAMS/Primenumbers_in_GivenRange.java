import java.util.Scanner;
class Primenumbers_in_GivenRange 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter minimum range");
		int min = scan.nextInt();
		System.out.println("Enter maximum range");
		int max = scan.nextInt();		
		for (int i=min;i<=max ;i++ )
		{
			int count = 0;
			for (int a=1;a<=i ;a++ )
			{
				if (i%a==0)
				{
					count++;				
				}
			}
			if (count==2)
			{
				System.out.println(i);
			}
			
		}
	}
}
