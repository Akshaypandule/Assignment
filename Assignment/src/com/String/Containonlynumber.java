package com.String;

import java.util.Scanner;

public class Containonlynumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String here....");
		String str=sc.next();
		int len=str.length();
		if(checkonlydigit(str, len))
		{
			System.out.println("String is Numeric");
		}
		else
		{
			System.out.println("String is not Numeric");
		}
	}
	public static boolean checkonlydigit(String str,int n) {
		
		for(int i=0;i<n;i++) {
			if(str.charAt(i)<'0'|| str.charAt(i)>'9') {
				return false;
			}
		}
		return true;
		
	}
	

}
