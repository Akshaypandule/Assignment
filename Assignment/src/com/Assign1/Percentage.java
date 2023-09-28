package com.Assign1;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter English mark");
		float s1=sc.nextFloat();
		System.out.println("Enter Marathi mark");
		float s2=sc.nextFloat();
		System.out.println("Enter Hindi mark");
		float s3=sc.nextFloat();
		
		
		float percentage=(s1+s2+s3)/3;
		
		System.out.println("Percentage ="+percentage+"%");
	}
	
	
	

}
