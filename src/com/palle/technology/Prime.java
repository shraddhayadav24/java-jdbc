package com.palle.technology;

import java.util.Scanner;

public class Prime {
	
		public String getValue (int n)
		{
			int count=0,i;
			for(i=1;i<=n;i++)
			{
					if(n%i==0)
					{
						count=count+1;
					}
				}
				 if(count==2)
				{
					return "  prime no";
				}
				else
				{
					return " not prime no";
				}
			}
			


public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the no");
	int n=sc.nextInt();
	
	Prime p=new Prime();
	String s=p.getValue(n);
	System.out.println(s);
}
}

	
