package com.palle.technology;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char ch='B';
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'|| ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("vowels");

		}
		else if(ch=='@'||ch=='#'||ch=='*')
		{
			System.out.println("Specail symbol");
		}
		else
		{
			System.out.println("Consonants");
			
		}

	}

}
