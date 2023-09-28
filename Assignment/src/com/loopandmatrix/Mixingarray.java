package com.loopandmatrix;

import java.util.Scanner;

public class Mixingarray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		System.out.println("Enter the Array elemnts");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		// Find smallest, highest positive number	
		int negation[]=new int[n];
		int smallestpositive=Integer.MAX_VALUE;
		int largestpositive=Integer.MIN_VALUE;
		int smallestNegative=Integer.MAX_VALUE;
		int largeNegative=Integer.MIN_VALUE;
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]>0) {
				
				if(arr1[i]<smallestpositive)
				{
					smallestpositive=arr1[i];
				}
				if(arr1[i]>largestpositive) {
					largestpositive=arr1[i];
				}
				
			}
			if(arr1[i]<0) {
				
				if(arr1[i]<smallestNegative) {
					smallestNegative=arr1[i];
				}
				if(arr1[i]>largeNegative) {
					largeNegative=arr1[i];
				}
				
			}
			negation[i]=-arr1[i];
		}
		System.out.println("Smallest Positive value ="+smallestpositive);
		System.out.println("Large Positive value = "+largestpositive);
		System.out.println("Smallest Positive value ="+smallestNegative);
		System.out.println("Large Positive value = "+largeNegative);
		
		for(int k=0;k<negation.length;k++) {
			System.out.print(negation[k]);
		}

	
	}

}
