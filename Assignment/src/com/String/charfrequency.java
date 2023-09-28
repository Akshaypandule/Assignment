package com.String;

import java.util.Scanner;

public class charfrequency {
	
	
	public static int findcharfrequency(String str ,char c)
	{
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)== c) {     
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String here");
		String str=sc.nextLine();
		System.out.println("Enter char to find frequency");
		String c1=sc.next();
		char c=c1.charAt(0); // convert String into char
		
		System.out.println(findcharfrequency(str, c));
	}

}
