package com.loopandmatrix;

import java.util.Scanner;

public class matrixtranspose {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size");
		int row=sc.nextInt();
		System.out.println("Enter the coloum size");
		int column=sc.nextInt();
		
		int matrix[][]=new int[row][column];
		System.out.println("Enter the row and column element");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println("display matrix");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("Transpose matrix");
		
		for(int i=0;i<column;i++) {
			for(int j=0;j<row;j++) {
				
				System.out.print(matrix[j][i]+" ");
			}
			System.out.println();
		}
	}

}
