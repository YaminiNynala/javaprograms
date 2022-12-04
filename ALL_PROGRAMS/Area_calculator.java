import java.util.Scanner;
class  Area_calculator
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Area calculator");
		System.out.println();
		System.out.println("Enter 1 to find area of circle");
        System.out.println("Enter 2 to find area of triangle");
		System.out.println("Enter 3 to find area of square");
		System.out.println("Enter 4 to find area of rectangle");
        System.out.println();
		System.out.println("enter your choice");
		int choice= scan.nextInt();
		if (choice==1)
		{
			System.out.println("you have selected circle to find its area");
            System.out.println("enter radius of a circle in cms");
			double radius = scan.nextDouble();
			double circle_area = 3.14*radius*radius;
			System.out.println("Area of circle is : "+circle_area+" sq.cms");
		}
		else if (choice==2)
		{
			System.out.println("you have selected triangle to find its area");
			System.out.println("enter the base value in cms");
			double base = scan.nextDouble();
			System.out.println("enter the height value in cms");
			double height = scan.nextDouble();
            double triangle_area = 0.5*base*height;
			System.out.println("Area of triangle is : "+triangle_area+" sq.cms");
		}
		else if (choice==3)
		{
			System.out.println("you have selected square to find its area");
            System.out.println("enter side value in cms");
			double side = scan.nextDouble();
			double square_area = side*side;
			System.out.println("Area of square is : "+square_area+" sq.cms");
		}
		else if (choice==4)
		{
		    System.out.println("you have selected rectangle to find its area");
			System.out.println("enter the length value in cms");
			double length = scan.nextDouble();
			System.out.println("enter the breadth value in cms");
			double breadth = scan.nextDouble();
            double recangle_area = length*breadth;
			System.out.println("Area of rectangle is : "+recangle_area+" sq.cms");	
		}
		else 
		{
            System.out.println("enter a valid input");
		}
		System.out.println("Thank you");
	}
}
