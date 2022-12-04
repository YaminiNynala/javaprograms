import java.util.Scanner;
class  Exponential_value
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter base value");
		int base = scan.nextInt();
		System.out.println("enter power value");
		int power = scan.nextInt();

		int exp=1;
		//we have to multiply the base power times
		//so we have to use a loop
		for (int a=1;a<=power ;a++ )
		{
			exp=exp*base;
		}
		System.out.println(base+" raised to the power "+power+" is : "+exp);
	}
}
