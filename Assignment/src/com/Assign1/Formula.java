package com.Assign1;

import java.util.Scanner;

public class Formula {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of x");
		int x=sc.nextInt();
		System.out.println("Enter value of y");
		int y=sc.nextInt();
		
		int formula_1 = (x+y)*2;
		System.out.println("Ans of (x+y)^2 is = "+formula_1);
		
		int formula_2 = (x*x)+(y*y);
		System.out.println("Ans of (x^2+y^2) is = "+formula_2);
	}
}
