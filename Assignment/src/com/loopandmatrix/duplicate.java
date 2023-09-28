package com.loopandmatrix;

import java.util.Scanner;

public class duplicate {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the element in Array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		// Find out duplicate elements
		int duplicate[]=new int[size];
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+",");
					
				}
				
			}
		}
		
	}

}
