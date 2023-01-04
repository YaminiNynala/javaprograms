import java.util.Scanner;
class MonthNameStaticNonStatic 
{
	public static void run()
	{
		System.out.println("run 10 km");
	}
	public void walk()
	{
		System.out.println("walk 5 km");
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month name");
		String month = scan.next();
		MonthNameStaticNonStatic m1 = new MonthNameStaticNonStatic();
		switch (month)
		{
		case "jan":case "feb":case "mar":case "apr":case "may":case "jun":run();
		break;
		case "jul":case "aug":case "sep":case "oct":case "nov":case "dec":
        m1.walk();
		break;
		default:
			run();
		    m1.walk();
		}
	}
}
