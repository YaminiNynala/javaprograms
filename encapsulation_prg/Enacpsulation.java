class Calender
{
	private int monthNumber;
	public void giveMonth(int monthNumber)
	{
		if (monthNumber>=1 && monthNumber<=12)
		{
			System.out.println("Month number is valid");
			this.monthNumber = monthNumber;
		}
		else
		{
			System.out.println("month number is invalid");
		}
	}
	public void display()
		{
			System.out.println("Month Number is : "+monthNumber);
		}
}
class Enacpsulation1
{
	public static void main(String[] args) 
	{
		Calender c1 = new Calender();
		c1.giveMonth(5);
		c1.display();
	}
}
