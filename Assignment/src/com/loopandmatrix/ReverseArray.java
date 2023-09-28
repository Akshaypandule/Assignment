package com.loopandmatrix;

import java.util.Scanner;

public class ReverseArray {
public static void reversearray(int arr[]) {
		int n=arr.length;
		int b[]=new int[n];
		int j=n;
		for(int i=0;i<n;i++) {
			b[j-1]=arr[i];
			j=j-1;
		}
		for(int k=0;k<n;k++) {
			System.out.println(b[k]);
		}
	}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size.");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array elements");
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();	
		}
		
		reversearray(arr);
	}

}
