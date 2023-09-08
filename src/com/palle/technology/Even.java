package com.palle.technology;

public class Even {
public String getvalue (int no)
{
	if(no%2==0)
	{
		return "even";
	}
	else
	{
		return "odd";
	}
}

public static void main(String args[])
{
	Even e=new Even();
	String s= e.getvalue(55);
	System.out.println(s);
	
	
}
}
