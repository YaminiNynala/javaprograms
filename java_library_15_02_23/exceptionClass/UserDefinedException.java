package exceptionClass;

import java.util.Scanner;

public class UserDefinedException 
{
	public static void main(String[] args) 
	{
		String databaseUsername = "Yamini@gmail.com";
		String databasePassword = "Yaminiramya";
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the username : ");
		String username = scan.next();
		
		if (databaseUsername.equals(username))
		{
			System.out.print("Enter the password : ");
			String password = scan.next();
			if (databasePassword.equals(password))
			{
				System.out.println("you have succesfully logged in...");
			}
			else
			{
				throw new IncorrectPasswordException();
			}
		}
		else 
		{
			throw new IncorrectUsernameException();
		}
	}
}

/*
Handling:

package exceptionClass;

import java.util.Scanner;

public class UserDefinedException 
{
	public static void main(String[] args) 
	{
		String databaseUsername = "Yamini@gmail.com";
		String databasePassword = "Yaminiramya";
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the username : ");
		String username = scan.next();
		System.out.print("Enter the password : ");
		String password = scan.next();
		
		if (databaseUsername.equals(username))
		{
			if (databasePassword.equals(password))
			{
				System.out.println("you have succesfully logged in");
			}
			else
			{
				try
				{
					throw new IncorrectPasswordException();
				}
				catch(IncorrectPasswordException IPE)
				{
					System.out.println("IPE Handled");
				}
			}
		}
		else 
		{
			try
			{
				throw new IncorrectUsernameException();
			}
			catch(IncorrectUsernameException IUE)
			{
				System.out.println("IUE Handled");
			}
		}
	}
}

*/