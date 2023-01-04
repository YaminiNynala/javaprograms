class H
{
	public void run()
	{
		System.out.println("run a mile");
	}
}
class I extends H
{
	public char ch = '@';
}
class J extends I
{
	public void display()
	{
		run();
		System.out.println(ch);
	}
}
class MainClass4 
{
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.display();
	}
}
