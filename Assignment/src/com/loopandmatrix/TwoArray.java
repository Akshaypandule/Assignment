package com.loopandmatrix;

import java.util.Scanner;

public class TwoArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array size");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		int arr2[]=new int[size];
		
		System.out.println("Enter the element on first arr1");
		for(int i=0;i<size;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the element in  arr2");
		for(int i=0;i<size;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+" ");
				}
			}
		}
		
/*	 Compute delta array from given arrays
         e.g. In our eg. Delta array = [2,2,1,5,5,10,10]
             Explaination: each element of delta array is differance between elements of arr1 and arr2,
              so in delta array, the first element '2' is actully differance between first element of arr1 and first element of arr2 
              that is : 4-2 = 2, 
              simillary 7-5=2, 2-3=1, 6-1=5, 9-4=5 and so on*/
		
		
		int delta[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			delta[i]=arr1[i]-arr2[i];
		}
		for(int i=0;i<size;i++)
		{
                 System.out.println(delta[i]);
		}
	}

}
