class Sunny_Number 
{
	public static void main(String[] args) 
	{
		int n=48;
		double sq=Math.sqrt(n+1);
		double floor=Math.floor(sq);
		if (sq-floor==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
