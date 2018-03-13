package org.Custom.ExceptionVoter;

public class VoterException extends Exception
{
	public VoterException() 
	{
		super("You are not allow to vote...");
	}
}
