import java.util.Scanner;
class  CostPriceOfBookPercentSir
{
	public static double convertPercentToRs(double sellingPrice,double profitPercent)
	{
		double profitInRs = (sellingPrice*profitPercent)/100;
		return profitInRs;
	}
	public static void findCostPrice()
	{
		double sellingPrice = 100;
		double profitInRs = convertPercentToRs(sellingPrice,10);
		double costPrice = sellingPrice-profitInRs;
		System.out.println("Cost price of the book: "+costPrice);
	}
	public static void main(String[] args) 
	{
		findCostPrice();
	}
}
