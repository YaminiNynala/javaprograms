import java.util.Scanner;
class NaturalNumbers_Givenrange_Manner 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter min range");
		int min = scan.nextInt();
        System.out.println("Enter max range");
		int max = scan.nextInt();
		for (int a=min;a<=max ;a++ )
		{
			int count=0;
			for (int i=1;i<=a ;i++ )
			{
				if (a%i==0)
				{
					count++;
				}
			}
			if (count<2)
			{
               System.out.println(a+" is neither prime nor composite");
			}
			else if (count==2)
			{
				System.out.println(a+" is prime number");
			}
			else 
			{
				System.out.println(a+" is composite number");
			}
		}
	}
}
