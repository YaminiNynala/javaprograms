import java.util.Scanner;
class Automorphic_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is automorphic or not");
		int num = scan.nextInt();
		int temp = num;
		int count = 0;
		while (num!=0)
		{
			count++;
			num=num/10;
		}
		num = temp;
		int product =1;
		for (int i=1;i<=count ;i++ )
		{
			product=product*10;
		}
		int square = num*num;
		int last = square%product;
		System.out.println((last==num)?"automorphic":"not automorphic");
	}
}
