import java.util.Scanner;
class CostPrice2 
{
	public static void findCostPrice(int sellingPrice,double profitPercent)
	{
		double profit = sellingPrice*profitPercent;
		double costPrice = sellingPrice-profit ;
		System.out.println("Cost price : "+costPrice);
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter selling price of a book");
		int sellingPrice = scan.nextInt();
		System.out.println("Enter profit percent in decimal");
		double profitPercent = scan.nextDouble();
		findCostPrice(sellingPrice,profitPercent);
	}
}
