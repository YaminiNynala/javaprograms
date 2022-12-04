import java.util.Scanner;
class Area_of_the_circle 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter radius");
		int radius = scan.nextInt();
		double area = 3.14*radius*radius;
		System.out.println("Area of circle having radius "+radius+ " is: "+area);
	}
}
