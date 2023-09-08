package com.palle.technology;

public class Palindrome {
public static void main(String args[])
{
	int n=123;
	int rev=0,rem,temp = 0;
	while(n>0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	System.out.println(rev);
	if(temp==rev)
	{
		System.out.println("no is palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}
}
