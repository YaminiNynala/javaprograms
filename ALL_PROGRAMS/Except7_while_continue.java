class Except7_while_continue 
{
	public static void main(String[] args) 
	{
		int a=1;
		while (a<=10)
		{
			if (a==7)
			{
				a++;
				continue;
			}
			System.out.println(a);
			a++;
		}
		
	}
}
