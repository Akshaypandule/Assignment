package com.Assign1;

import java.util.Scanner;

public class Area_Reactangle {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length value");
		float length=sc.nextFloat();
		System.out.println("Enter the Width value");
		float Width=sc.nextFloat();
		
		float area=length*Width;
		
		System.out.println(area);
	}

}
