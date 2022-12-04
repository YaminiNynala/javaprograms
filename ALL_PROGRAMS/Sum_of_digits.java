import java.util.Scanner;
class Sum_of_digits 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to get sum of its digits");
		int num = scan.nextInt();
        int lastdigit=0;
		int sum=0;
		while (num!=0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;
		}		
		System.out.println(sum);
	}
}
