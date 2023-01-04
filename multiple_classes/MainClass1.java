class M
{
	public String wish = "Happy Birthday";
    public static void greet()
	{
		M m1 = new M();
		System.out.println(m1.wish);
	}
}
class N
{
	public static boolean result = true;
	public void display()
	{
		System.out.println(result);
	}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		M.greet();
        N n1 = new N();
		n1.display();
	}
}
