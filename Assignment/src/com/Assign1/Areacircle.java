package com.Assign1;

import java.util.Scanner;

public class Areacircle {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius value");
		float radius=sc.nextFloat();
		
		float pi=3.14f;
		
		float Area=pi*radius*radius;
		
		System.out.println("Area of Circle "+Area);
		
		
	}

}
