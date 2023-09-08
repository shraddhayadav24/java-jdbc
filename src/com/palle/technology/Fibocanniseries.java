package com.palle.technology;

public class Fibocanniseries {
	public static void main (String args[])
	{
		int n1=0,n2=1,n3,i;
		System.out.println(n1);
		System.out.println(n2);
		for(i=0;i<=10;i++)
		{
			n3=n2+n1;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
	}
}
