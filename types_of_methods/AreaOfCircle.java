class AreaOfCircle 
{
	public static int findRadius(int diameter)
	{
		int radius = diameter/2;
		return radius;
	}
	public static void findArea()
	{
		int radius = findRadius(10);
		double area = 3.14*radius*radius;
		System.out.println("Area of circle is: "+area);
	}
	public static void main(String[] args) 
	{
		findArea();
	}
}
