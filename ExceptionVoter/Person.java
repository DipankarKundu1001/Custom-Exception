package org.Custom.ExceptionVoter;

public class Person 
{
	
	public void isVoter(int age) throws VoterException
	{
		if(age <= 18)
		{
			throw new VoterException();
		}
	}
}
