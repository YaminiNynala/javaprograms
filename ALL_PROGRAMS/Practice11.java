
import java.util.Scanner;
class Practice11  
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Welcome to area calculator");
		System.out.println();
		System.out.println("Enter 1 to find area of circle");
		System.out.println("Enter 2 to find area of triangle");
		System.out.println("Enter 3 to find area of square");
		System.out.println("Enter 4 to find area of rectangle");
		System.out.println();
		int choice = scan.nextInt();
		if (choice==1)
		{
			System.out.println("you have selected circle to find its area");
			System.out.println("Enter radius value in cms");
			double radius = scan.nextDouble();
			double circle_area = 3.14*radius*radius;
			System.out.println("Area of circle is : "+circle_area);
		}
		else if (choice==2)
		{
			System.out.println("you have selected triangle to find its area");
			System.out.println("Enter base value in cms");
			double base = scan.nextDouble();
			System.out.println("Enter height value in cms");
			double height = scan.nextDouble();
			double triangle_area = 0.5*base*height;
			System.out.println("the area of a triangle is: " +triangle_area);
		}
		else if (choice==3)
		{
			System.out.println("you have selected sqaure to find its area");
			System.out.println("Enter side value in cms");
			double side = scan.nextDouble();
			double square_area = side*side;
			System.out.println("the area of a square having side"+side+" is: " +square_area);
		}
		else if (choice==4)
		{
			System.out.println("you have selected recangle to find its area");
			System.out.println("Enter length value in cms");
			double length = scan.nextDouble();
			System.out.println("Enter breadth value in cms");
			double breadth = scan.nextDouble();
			double recangle_area = length*breadth;
			System.out.println("the area of a recangle having length"+length+" and breadth "+breadth+" is: "+recangle_area);
		}
		else
			System.out.println("enter a valid input");
	}
}
