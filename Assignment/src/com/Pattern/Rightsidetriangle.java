package com.Pattern;

import java.util.Scanner;

public class Rightsidetriangle {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			for(int  j=i;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
//* * * * * * * * * * 
//* * * * * * * * * 
//* * * * * * * * 
//* * * * * * * 
//* * * * * * 
//* * * * * 
//* * * * 
//* * *       Ans
//* * 
//* 