import java.util.Scanner;
class  Practice3
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enetr the first value");
		double n1 = scan .nextDouble();
		System.out.println("Enter the second value");
		double n2 = scan .nextDouble();
		System.out.println("Enter the third value");
		double n3 = scan .nextDouble();
		System.out.println("Enter the fourth value");
		double n4 = scan .nextDouble();
		System.out.println("Enter the fifth value");
		double n5 = scan .nextDouble();
		double avg= (n1+n2+n3+n4+n5)/5;
        System.out.println("the avg of "+n1+ ", "+n2+", "+n3+ ", "+n4+" and "+n5+" is: "+avg);
	}
}
