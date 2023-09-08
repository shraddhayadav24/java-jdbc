package com.palle.technology;

public class Donating {
public static void main(String args[])
{
	int age=23;
	int wieght=50;
	if(age>=18 && age<=60)
	{
		if(wieght>=45)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
	}
	else
	{
		System.out.println("not Eligible");
	}
}
}
