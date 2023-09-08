package com.palle.technology;

public class BiggestTwoDigitNumber {
	public static void main(String args[])
	{
		String s="7038956756";
		String[] a=s.split("");
		int temp=0,i;
		
		for(i=0;i<a.length-1;i++)
		{
			String b=a[i];
			String c=a[i+1];
			
			int x=Integer.parseInt(b);
			int y=Integer.parseInt(c);
			
			int z=x*10+y;
			
			if(z>temp)
			{
				temp=z;
			}
		}
		System.out.println(temp);
	}
}
