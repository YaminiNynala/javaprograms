import java.util.Scanner;
class CostPriceOfBookScanner 
{
	public static void findCostPrice(double x,double y)
	{
		double costPrice = x-y;
		System.out.println("Selling price : "+x);
		System.out.println("Profit : "+y);
		System.out.println("Cost price : "+costPrice);
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter selling price of a book");
		double x = scan.nextDouble();
		System.out.println("Enter profit of a book");
		double y = scan.nextDouble();
		findCostPrice(x,y);
	}
}
