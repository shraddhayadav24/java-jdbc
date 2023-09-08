package com.palle.technology;

public class Prime2 {
public static void main(String args[])
{
	int n=4,i;
	int count=0;
	for(i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			count++;
			break;
		}
	}
	if(count==0)
	{
		System.out.println("prime");
	}
	else
	{
		System.out.println("not prime");
	}
}
}
