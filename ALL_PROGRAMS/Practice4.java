import java.util.Scanner;
class  Practice4
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter radius value: ");
		double radius = scan.nextDouble();
		System.out.println("the area of a circle having radius "+radius+ " is: "+(3.14*radius*radius));
	}
}
