import java.util.Scanner;
class RadiusOfCircleScanner
{
	public static void findRadius(double diameter)
	{
		double radius = diameter/2;
		System.out.println("diameter: "+diameter);
		System.out.println("radius: "+radius);
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the diameter in the form of decimal");
		double diameter = scan.nextDouble();
		findRadius(diameter);
	}
}
