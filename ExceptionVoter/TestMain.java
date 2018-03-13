package org.Custom.ExceptionVoter;

import java.util.Scanner;

public class TestMain 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age :- ");
		int age = sc.nextInt();
		sc.close();
		Person p1 = new Person();
		try
		{
			p1.isVoter(age);
			System.out.println("You are allowed to vote...");
		}
		catch (VoterException e) 
		{
			//System.out.println(e.getMessage());
			//System.out.println(e);
			e.printStackTrace();
		}
		
	}
}
