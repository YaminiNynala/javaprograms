import java.util.Scanner;
class AreaOfCircleScanner 
{
	public static int findRadius(int diameter)
	{
		int radius = diameter/2;
		return radius;
	}
	public static void findArea()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter diameter of circle");
		int diameter = scan.nextInt();
		int radius = findRadius(diameter);
		double area = 3.14*radius*radius;
		System.out.println("Area of circle is: "+area);
	}
	public static void main(String[] args) 
	{
		findArea();
	}
}