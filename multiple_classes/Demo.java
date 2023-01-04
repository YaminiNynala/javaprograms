class Sample 
{
	public static void walk() //changeColor
	{
		System.out.println("walk 5 km");  //write in different color
	}
	public void run() //fillInk
	{
		System.out.println("run 10 km");  //fill with red color
	}
}
class Demo  // save with the class having main method so we have to save as "Demo.java"
{
	public static void main(String [] args)
	{
		Sample.walk();
		Sample s1 = new Sample();
		s1.run();
	}
}