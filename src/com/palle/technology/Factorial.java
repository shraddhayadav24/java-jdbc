package com.palle.technology;

public class Factorial {
	public static void main(String args[])
	{
		int n=9,fact=1,i;
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
