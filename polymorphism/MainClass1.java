class Car
{
	public void mileage()
	{
	}
}
class Audi extends Car
{
	public void mileage()
	{
		System.out.println("14kmpl");
	}
}
class Benz extends Car
{
	public void mileage()
	{
		System.out.println("18kmpl");
	}
}
class MainClass1  
{
	public static void display(Car c)
	{
		c.mileage();
	}
	public static void main(String[] args) 
	{
		display(new Audi());
		display(new Benz());
	}
}
