import java.util.Scanner;
class Reverse_a_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number to reverse it");
		int num = scan.nextInt();
		int temp=num;
		int rev=0;
		int lastdigit=0;
		while (num!=0)
		{
            lastdigit=num%10;
			rev=rev*10+lastdigit;
			num=num/10;
		}
		System.out.println("the reverse of given number "+temp+" is: "+rev);
		// we are using temp because num becomes 0 
	}
}
