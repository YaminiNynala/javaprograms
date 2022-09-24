class Hcf_of_8and12 
{
	public static void main(String[] args) 
	{
       int a=8;
	   int b =12;
	   int hcf=0;
	   for (int i=1;i<=a ;i++ )
	   {
		   if (a%i==0&&b%i==0)
		   {
			   hcf=i;
		   }
	   }
	   System.out.println(hcf);
	}
}
