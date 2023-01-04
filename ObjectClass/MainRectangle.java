package ObjectClass;

public class MainRectangle 
{

	public static void main(String[] args) 
	{
		Rectangle r1 = new Rectangle(12, 4);
		Rectangle r2 = new Rectangle(12, 8);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println("comparision of areas : "+r1.equals(r2));
	}

}
