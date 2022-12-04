import java.util.Scanner;
class  Area_of_figures
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("1=square, 2=rectangle, 3=circle, 4=triangle");
		System.out.println("Enter any figure number: ");
		int figure = scan.nextInt();
		
		if (figure==1)
		{
			System.out.println("enter side value");
            double side = scan.nextDouble();
			System.out.println("Area of Square having side "+side+" is: "+(side*side));
		}
		else if (figure==2)
		{
			System.out.println("enter length value");
			double length = scan.nextDouble();
			System.out.println("enter breadth value");
			double breadth = scan.nextDouble();
            System.out.println("Area of Rectangle having length "+length+" and breadth "+breadth+" is: "+(length*breadth));
		}
		else if (figure==3)
		{
			System.out.println("enter the radius");
			double radius = scan.nextDouble();
            System.out.println("Area of circle having radius "+radius+" is: "+(3.14*radius*radius));
		}
		else if (figure==4)
		{
			System.out.println("enter the base value");
			double base = scan.nextDouble();
			System.out.println("enter the height value");
			double height = scan.nextDouble();
			System.out.println("the area of a triangle having base "+base+" and height " +height+" is: "+(0.5*base*height));
		}
		else 
		{
			System.out.println("enter the valid figure number: ");
		}
	}
}
