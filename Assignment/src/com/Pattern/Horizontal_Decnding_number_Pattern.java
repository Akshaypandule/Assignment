package com.Pattern;

import java.util.Scanner;

public class Horizontal_Decnding_number_Pattern {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number.....");
		int n=sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			
			for(int j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
