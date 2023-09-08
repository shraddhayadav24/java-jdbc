package com.palle.technology;

public class NextCharOfElement {
	public static void main(String args[])
	{
		char[] x= {'l','z','q','b','g'};
		for(int i=0;i<=x.length-1;i++)
		{
			if(x[i]!='z')
			{
				x[i]=(char)(x[i]+1);
				System.out.println(x[i]);
			}
			else
			{
				x[i]='a';
				System.out.println(x[i]);
			}
		}
	}
}
