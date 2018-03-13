package org.Custom.ExceptionBank;

import java.util.Scanner;

public class DemoMain 
{
	public static void main(String[] args) 
	{
		Account a1 = new Account(1000);
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the amount :- ");
		int amt = sc.nextInt();
		sc.close();
		try
		{
			a1.withdraw(amt);
			System.out.println("amount Withdrawl");
		}
		catch (InsufficientFundException e) 
		{
			//solution
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}

}
