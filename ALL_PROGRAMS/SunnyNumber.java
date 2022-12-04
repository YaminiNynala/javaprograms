class SunnyNumber 
{
	public static void main(String[] args) 
	{
		int num=36;
		int n = num+1 ;
		double temp;
		double sr = n/2;
		do
		{
			temp=sr;
			sr = (temp+(n/temp))/2;
		}
		while ((temp-sr)!=0);
		//System.out.println(sr);
		if (sr%2==0)
		{
			System.out.println(num+": Sunny number");
		}
		else
		{
			System.out.println(num+": Not Sunny number");
		}
	}
}
