package com.String;

import java.util.Scanner;

public class Rotation {
	
	public static String rotaionofstring(String str,int n) {
		String result = null;
		try
		{
		 String str1=str.substring(n);
		 String str2=str.substring(0,n);
		 result=str1+str2;
		}
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		 return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String a=sc.next();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		
		rotaionofstring(a, n);
		
		String result=rotaionofstring(a,n);
		System.out.println(result);
		
	}

}
