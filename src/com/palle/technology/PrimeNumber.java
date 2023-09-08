package com.palle.technology;

public class PrimeNumber {
	public static void main(String args[])
	{
		int count,i,j;
		for(i=1;i<=100;i=i+1)
		{
			count=0;
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
					
				}
				
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}
	}
}
