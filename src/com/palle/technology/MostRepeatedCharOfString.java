package com.palle.technology;

public class MostRepeatedCharOfString {
	public static void main(String[] args) {
		String s="palletechnologyBangolare";
		int count,temp=0;
		char c=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			count=1;
			for(int j=i+1;j<=s.length()-1;j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>temp)
			{
				temp=count;
				c=s.charAt(i);
			}
		}
		System.out.println(c);
		System.out.println(temp);
}
}
