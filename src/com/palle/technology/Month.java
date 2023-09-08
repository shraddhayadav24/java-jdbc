package com.palle.technology;

import java.util.Scanner;

public class Month {
	public String getDays(String m)
{
	switch(m)
	{
	case "jan":
	case "apr":
	case  "may":
	case "jul":
	case "aug":
	case "oct":
	case "dec":
		return "31 days";
	case "mar":
	case "jun":
	case "sep":
	case "nov":
		return "30 days";
	case "feb":
		return "28 or 29 days";
		default:
			return "enter month name first 3 char in lowercase";
		
		
	}	
}
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter month name");
		String month=sc.next();
		
		
		
		
		Month m=new  Month();
		String s = m.getDays(month);
		System.out.println(s);
	}
}
