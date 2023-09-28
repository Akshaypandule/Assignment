package com.String;

import java.util.Scanner;

public class vowelandcon { 
	public static void main(String[] args) {
		int vcount=0;
		int ccount=0;
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		for(int i=0;i<a.length()-1;i++) {
			char ch=a.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U') {
				vcount=vcount+1;	
			}
			else
			{
				ccount=ccount+1;
			}
		}
		System.out.println(vcount);
		System.out.println(ccount);
	}
	

}
