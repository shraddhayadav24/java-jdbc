package com.palle.technology;

public class Reverse {
	public static void main (String ags[])
	{
		int n=3456;
		int rev=0,rem;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}
