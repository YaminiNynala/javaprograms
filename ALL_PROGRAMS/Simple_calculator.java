import java.util.Scanner;
class  Simple_calculator
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to simple calculator");
		System.out.println();
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division(quotient)");
		System.out.println("Enter 5 for division(remainder)");
		System.out.println("Enter 6 to check number is even or odd");
		System.out.println("Enter 7 to check a person is eligible for voting or not ");
		System.out.println("Enter 8 to check a person is eligible for writing ias exam or not ");

		int choice = scan.nextInt();
		switch (choice)
		{
		case 1:System.out.println("you have chosen addition option");
			System.out.println("enter first number");
		    double a =scan.nextDouble();
			System.out.println("enter second number");
			double b =scan.nextDouble();
			System.out.println("sum of "+a+" and "+b+" is: "+(a+b));
		break;

		case 2:
			System.out.println("you have chosen subtraction option");
		    System.out.println("enter first number");
		    double c =scan.nextDouble();
			System.out.println("enter second number");
			double d =scan.nextDouble();
			System.out.println("difference of "+c+" and "+d+" is: "+(c-d));
		break;

		case 3:System.out.println("you have chosen multiplication option");
			System.out.println("enter first number");
		    double e =scan.nextDouble();
			System.out.println("enter second number");
			double f =scan.nextDouble();
			System.out.println("product of "+e+" and "+f+" is: "+(e*f));
		break;

		case 4:System.out.println("you have chosen division(quotient) option");
			System.out.println("enter first number");
		    double g =scan.nextDouble();
			System.out.println("enter second number");
			double h =scan.nextDouble();
			System.out.println("quotient of "+g+" and "+h+" is: "+(g/h));
		break;

		case 5:System.out.println("you have chosen division(remainder) option");
			System.out.println("enter first number");
		    double i =scan.nextDouble();
			System.out.println("enter second number");
			double j =scan.nextDouble();
			System.out.println("remainder of "+i+" and "+j+" is: "+(i%j));
		break;

		case 6:
			System.out.println("you have chosen even or odd option");
		    System.out.println("enter a number to check even or odd");
	        System.out.println("enter a number");
	   	    int k = scan.nextInt();
			if (k%2==0)
		    {
                System.out.println(k+" is even number");
		    }
		    else
			    System.out.println(k+" is odd number"); 	
		break;

		case 7:System.out.println("you have chosen to check a person is eligible for voting or not ");
		    int age = scan.nextInt();
		    if (age>=18)
		    {
		      System.out.println("eligible for voting");
    	    }
		    else
            {
		      System.out.println("Not eligible for voting");
            }
		break;

		case 8:System.out.println("you have chosen to check a person is eligible for writing ias exam or not ");
           int age1 = scan.nextInt();
		    if (age1>=21 && age1<=32)
		    {
		      System.out.println("eligible for exam");
    	    }
		    else
            {
		      System.out.println("Not eligible for exam");
            }
		break;

        default : System.out.println("Enter valid input");
		}
		System.out.println("thank you");
	}
}
