import java.util.Scanner;
class  CostPriceOfBookPercent
{
	public static double findProfit(double profitPercent)
	{
		int sp =2000;
		double profit = profitPercent*sp/100;
		return profit;
	}
	public static void findCostPrice(int sellingPrice)
	{
		double profitpercent = findProfit(20);
		double costPrice = sellingPrice-profitpercent;
		System.out.println("Cost price : "+costPrice);
	}
	public static void main(String[] args) 
	{
		
		findCostPrice(2000);
	}
}
