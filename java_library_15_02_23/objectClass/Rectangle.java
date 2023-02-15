package objectClass;

public class Rectangle 
{
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public int findArea()
	{
		int area = length * breadth;
		return area;
	}
	public String toString()
	{
		return "Area of Rectangle : "+findArea();
	}
	public boolean equals(Object o)
	{
		Rectangle r = (Rectangle) o;
		return this.length == r.length && this.breadth == r.breadth;
	}

}
