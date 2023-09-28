package com.Pattern;

import java.util.Scanner;

public class One_zero_pattern {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number..");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<=i;j++) {
				if(j%2==1) {
					System.out.print("0 ");
				}
				else
				{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}

}
