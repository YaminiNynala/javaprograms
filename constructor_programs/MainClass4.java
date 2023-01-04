class Marker
{
	public static int height=10;
	public String colour;
	public Marker(String z)
	{
		colour=z;
	}
	public void display()
	{
		System.out.println("height of a marker is : "+height+" cm");
		System.out.println("colour of a marker is : "+colour);
		System.out.println("--------------------------------------");
	}
}
class MainClass4 
{
	public static void main(String[] args) 
	{
		Marker m1 = new Marker("Black");
		Marker m2 = new Marker("Blue");
		Marker m3 = new Marker("Red");
		Marker m4 = new Marker("Green");
		m1.display();
		m2.display();
		m3.display();
		m4.display();
	}
}
