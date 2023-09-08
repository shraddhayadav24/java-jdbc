package com.palle.technology;

import java.util.Scanner;

public class Fizz {
	public String getFizzBuzz(int i)
	{
		if(i%3==0 && i%5==0)
		{
			return "FizzBuzz";
		}
		else if(i%5==0)
		{
			return "Buzz";
		}
		else if(i%3==0)
		{
			return "Fizz";
		}
		else 
		{
			return "BuzzFizz";
		}
		
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int i =sc.nextInt();
		
		
		
		
		Fizz f=new  Fizz();
		String s = f.getFizzBuzz(i);
		System.out.println(s);
	}
}
