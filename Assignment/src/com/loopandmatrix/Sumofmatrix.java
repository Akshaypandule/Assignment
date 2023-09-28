package com.loopandmatrix;

import java.util.Scanner;

public class Sumofmatrix {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a matrix row size");
		int row=sc.nextInt();
		System.out.println("Enter a matrix coloumn size");
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		
		System.out.println("Enter the a matrix elements");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("Enter b matrix row size");
		int row1=sc.nextInt();
		System.out.println("Enter b matrix coloumn size");
		int column1=sc.nextInt();
		int b[][]=new int[row][column];
		
		System.out.println("Enter the b matrix elements");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				b[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("Dispaly a matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Display b matrix");
		
		for(int i=0;i<row1;i++) {
			for(int j=0;j<column1;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		int c[][]=new int[row][column];
		System.out.println("Sum of two matrix..");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
