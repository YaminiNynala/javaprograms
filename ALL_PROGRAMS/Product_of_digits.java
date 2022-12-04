import java.util.Scanner;
class Product_of_digits 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to print its product of digits");
		int num = scan.nextInt();
		int product=1;    
		while (num>0)
		{
			int digit=num%10;
			product=product*digit;    
            num=num/10;               // variable update
		}
		System.out.println(product);
	}
}
