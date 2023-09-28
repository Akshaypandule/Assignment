package com.loopandmatrix;

import java.util.Scanner;

public class Missingnumer {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Array size");
	int size=sc.nextInt();
	int n=10;
	int arr[]=new int[size];
	System.out.println("Enter Array elements.....");
	for(int i=0;i<size ;i++)
	{
		arr[i]=sc.nextInt();
	}
	int expectedsum=n*(n+1)/2;
	int totalsum=0;
	for(int i=0;i<size ;i++)
	{
		totalsum+=arr[i];
	}
	int missingelement=expectedsum-totalsum;
	System.out.println(missingelement);
	}
}
