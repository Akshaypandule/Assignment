package com.String;

import java.util.Scanner;

public class Permutations {
	public static void permutations(String str,String ans) {  //  by using recursion
		if(str.isEmpty()) {
			System.out.println(ans+"");
			return;
		}
		for(int i=0;i<str.length();i++)
		{
		  char c=str.charAt(i);
		   String per=str.substring(0,i)+str.substring(i+1);
		   permutations(per, ans+c);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.next();
		permutations(a,"");
		
	}

}
