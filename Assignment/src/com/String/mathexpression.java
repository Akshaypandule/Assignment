package com.String;

import java.util.Scanner;

public class mathexpression {
	
	public static String determineoperation(String str) {
		
		if(str.contains("+")) {
			return"Addition";
		}
		else if(str.contains("*"))
		{
			return"Multiplication";
		}
		else if(str.contains("/"))
		{
			return"division";
		}
		else if(str.contains("-"))
		{
			return "Substraction";
		}
		else
		{
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Expression");
		String s=sc.next();
		determineoperation(s);
		
		String operationtype=determineoperation(s);
		
		if(operationtype!=null) {
			System.out.println("Operation type is "+operationtype);
		}
		else
		{
			System.out.println("Invalid data");
		}
	}

}
