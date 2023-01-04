import java.util.Scanner;
class CarScanner 
{
	public static void findTime(int distance,int speed)
	{
		int time = distance/speed;
		System.out.println("The time taken to complete the journey is: "+time+"hrs");
	}
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter distance");
		int distance = scan.nextInt();
		System.out.println("enter speed");
		int distance = scan.nextInt();
		findTime(distance,speed);
	}
}
