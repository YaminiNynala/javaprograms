import java.util.Scanner;
class Tech_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is a tech number or not");
		int n1=scan.nextInt();
		int temp = n1;
		int lastdigit=0;
		int count=0;
		while (n1!=0)
		{
			count++;
			n1=n1/10;
		}
		n1=temp;
		int y=1;
		for (int a=1;a<=count/2 ;a++ )
		{
			y=y*10;
		}
		int a = n1/y;
		int b = n1%y;
		int n2 = a+b;
		if (n2*n2==n1)
		{
			System.out.println("Tech number");
		}
		else
		{
			System.out.println("not Tech number");
		}
	}
}
