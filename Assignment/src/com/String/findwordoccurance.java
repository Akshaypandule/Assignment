package com.String;

import java.util.Scanner;

public class findwordoccurance {
	
	public static int countword(String str,String word)
	{
		
		String[]a=str.split(" ");
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals(word))
				count++;
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.nextLine();
		System.out.println("Enter the word");
		String word=sc.next();
		System.out.println(countword(str, word));
		
	}
}
