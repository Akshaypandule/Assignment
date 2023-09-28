package com.Assign1;

import java.util.Scanner;

public class Cube_Square {
	
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the number");
		 int n=sc.nextInt();
		 
		 int square=n*n;
		 int cube=n*n*n;
		 
		 System.out.println("square ="+square);
		 System.out.println("cube ="+cube);
	}

}
