package com.loopandmatrix;

import java.util.Scanner;

public class Pairaddition {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the Array element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		// find pair addition 10
		
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]+arr[j]==10)
				{
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
	}

}
