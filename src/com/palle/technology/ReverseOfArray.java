package com.palle.technology;

public class ReverseOfArray {
	public static void main(String args[])
	{
		int []a= {12,34,35,12,32};
		int[] b=new int[a.length];
		for(int i=0;i<=b.length-1;i++)
		{
			b[i]=a[a.length-1 -i];
			System.out.println(b[i]);
		}
	}
}
