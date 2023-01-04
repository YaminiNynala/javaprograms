class N
{
	public void exercise()
	{
		System.out.println("workout for 30 min");
	}
}
class O extends N
{
	public int j=56;
	public void run()
	{
		System.out.println("run for 20 min");
		System.out.println(j);
	}
}
class P extends N
{
	public int j=27;
	public void swim()
	{
		System.out.println("swim for 10 min");
		System.out.println(j);
	}
}
class MainClass6 
{
	public static void main(String[] args) 
	{
		O o1 = new O();
		o1.run();
		P p1 = new P();
		p1.swim();
	}
}
