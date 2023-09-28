package com.String;

import java.util.Scanner;

public class Case {
	
	public static String caseconvert(String str) {
		
		String s="";
		if(str.isEmpty())
		{
			return str;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);	
			if(Character.isUpperCase(ch))
			{
				s+=Character.toLowerCase(ch);
			}
			else
			{
				s+=Character.toUpperCase(ch);
			}
		}
		return s.toString();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String s=caseconvert(a); 
		System.out.println(s);
		
	}

}
