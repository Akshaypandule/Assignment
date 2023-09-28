package com.String;

import java.util.Scanner;

public class Hideeverythird {
	
	public static String hideeverythirdchar(String str) {
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if((i+1)%3!=0) {
				result.append(str.charAt(i));
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String a=sc.next();
		String b=hideeverythirdchar(a);
		System.out.println(b);
	}
}
