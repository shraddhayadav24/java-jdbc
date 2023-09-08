package com.palle.technology;

public class Sorting {
	public static void main (String args[])
	{
		int []a= {21,82,94,78,10,20,98,56};
		int temp,i,j;
		for(i=0;i<=a.length-1;i++)
		{
			for(j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
		
			}
			System.out.println(a[i]);
		}
		
	}
}
