package com.String;

import java.util.Scanner;

public class Swap {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		
		a=(a.concat(b));
		//System.out.println(str);
		
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a+" "+b);
	}

}
