import java.util.Scanner;
class  Car2
{
	public static double convert(double speed)
	{
		double speedPerMin = speed/60;
		return speedPerMin;
	}
	public static void calculateTime()
	{
		double distance = 1000;
		double speedPerMin = convert(200);
		double time = distance/speedPerMin;
		System.out.println("Total time taken: "+time);
	}
	public static void main(String[] args) 
	{
		calculateTime();
	}
}

