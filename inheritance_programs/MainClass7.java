class P
{
	public String msg="Good morning";
	public void greet()
	{
		System.out.println(msg);
	}
}
class Q extends P
{
	public void display()
	{
		greet();
	}
}
class R extends P
{
	public void details()
	{
		greet();
	}
}
class MainClass7 
{
	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.display();
		R r1 = new R();
		r1.details();
	}
}
