class Car 
{
	public static void calculateTime(int distance,int speed)
	{
		int time = distance/speed;
		System.out.println("The time taken to complete the journey is: "+time+"hrs");
	}
	public static void main(String[] args) 
	{
		calculateTime(450,150);
	}
}
