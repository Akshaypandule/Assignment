package com.loopandmatrix;

import java.util.Scanner;

public class count_occurances {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int [] fr = new int [arr.length]; 
		int isvisit=-1;
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Display arr1");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println("count occurances of all elements in the array");
		
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					
					fr[j]=isvisit;
				}
			}
			 if(fr[i] != isvisit)  
	                fr[i] = count;  
			
			
		}
		
		
	}
	
	


}
