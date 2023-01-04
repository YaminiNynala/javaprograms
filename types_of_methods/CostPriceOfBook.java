class CostPriceOfBook 
{
	public static void findCostPrice(double sellingPrice,double profit)
	{
		double costPrice = sellingPrice-profit;
		System.out.println("Cost price : "+costPrice);
	}
	public static void main(String[] args) 
	{
		findCostPrice(200,50.5);
	}
}
