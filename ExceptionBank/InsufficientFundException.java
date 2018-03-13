package org.Custom.ExceptionBank;

public class InsufficientFundException extends Exception 
{
	InsufficientFundException()
	{
		super("Insufficient Fund");
	}
	InsufficientFundException(String s)
	{
		super(s);
	}
	public String toString()
	{
		return "Insufficient fund Exception "+getMessage();
	}
}
