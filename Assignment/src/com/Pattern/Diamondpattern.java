package com.Pattern;

import java.util.Scanner;

public class Diamondpattern {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++) {
			
				for(j=1;j<=n-i;j++)   // space print
					{
						System.out.print(" ");
					}
			
		       	for(j=1;j<=i*2-1;j++) 
			      {
				System.out.print("*");  //Print star..
			       }
			System.out.println();
		}
		for(i=n-1;i>0;i--) {
			
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(j=1;j<=i*2-1;j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
