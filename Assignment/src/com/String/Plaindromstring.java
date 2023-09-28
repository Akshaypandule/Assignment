package com.String;

import java.util.Scanner;

public class Plaindromstring {
	
	public static boolean isplaindrom(String str) {
		String rev="";
		boolean ans=false;
		for(int i=str.length()-1;i>0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str)) {
			ans=true;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		a=a.toLowerCase();
		boolean b= isplaindrom(a);
		System.out.println(b);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter your String..");
//		String s=sc.next();
//		String rev="";
//		
//		for(int i=s.length()-1;i>=0;i--) {
//				rev=rev+s.charAt(i);
//			
//		}
//		if(s.equals(rev)) {
//			System.out.println("String is Palindrom");
//		}
//		else
//		{
//			System.out.println("String is not Palindrom");
//		}
//	}

}
