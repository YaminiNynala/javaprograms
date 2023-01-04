class K
{
	public int i=231;
}
class L extends K
{
	public int j=54;
	public void display()
	{
		System.out.println(i);
		System.out.println(j);
	}
}
class M extends K
{
	public double k =784;
	public void details()
	{
		System.out.println(i);
		System.out.println(k);
	}
}
class MainClass5 
{
	public static void main(String[] args) 
	{
		L l1 = new L();
		l1.display();
		M m1 = new M();
		m1.details();
	}
}
