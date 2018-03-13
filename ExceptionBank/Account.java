package org.Custom.ExceptionBank;

public class Account 
{
	private double bal;
	public Account(double bal)
	{
		this.bal = bal;
	}
	
	public double getBal()
	{
		return bal;
	}
	
	public void withdraw(int amt) throws InsufficientFundException
	{
		if(bal < amt)
		{
			String s = "Shortage of " + (amt-bal) + " rs";
			throw new InsufficientFundException(s);
		}
		
		//dispatch money
		
		bal -= amt;
	}
}
