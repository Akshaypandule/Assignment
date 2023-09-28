package com.String;

import java.util.Scanner;

public class LongestRepeatsequance {
	
	
	public static String substrind(String str1,String str2) {
		int n=Math.min(str1.length(), str2.length());
		for(int i=0;i<n;i++) {
			if(str1.charAt(i)!=str2.charAt(i)) {
				return str1.substring(0,i);
			}
		}
		return str1.substring(0,n);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String str1=sc.nextLine();
		System.out.println("Enter the second String...");
		String str2=sc.next();
	}

}
