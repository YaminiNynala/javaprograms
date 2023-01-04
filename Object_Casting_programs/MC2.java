class ShyamSingRoy
{
	public void writer()
	{
		System.out.println("write stories");
	}
}
class Gautham extends ShyamSingRoy
{
	public void director()
	{
		System.out.println("Direct movies");
	}
}
class MC2 
{
	public static void main(String[] args) 
	{
		ShyamSingRoy s1 = (ShyamSingRoy) new Gautham();
		s1.writer();
		Gautham g1 = (Gautham)s1;
		g1.writer();
		g1.director();
	}
}