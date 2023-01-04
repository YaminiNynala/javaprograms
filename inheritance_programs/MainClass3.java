class E
{
	public int i = 10;
}
class F extends E
{
	public int j = 20;
}
class G extends F
{
	public double k = 30;
	public void display()
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}
class MainClass3 
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		g1.display();
	}
}
