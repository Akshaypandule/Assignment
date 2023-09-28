package com.loopandmatrix;

import java.util.Scanner;

public class Arrayoperation {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int num=sc.nextInt();
		int []number=new int[num];
		System.out.println("Enter element in Array");
		for(int i=0;i<num;i++)
		{
			number[i]=sc.nextInt();
		}
		System.out.println("Display element");
		for(int i=0;i<num;i++)
		{
			System.out.print(number[i]+" ");
		}
		System.out.println();
		
		//Calculate and display addition of all numbers in the array
		
		int sum=0;
		for(int i=0;i<num;i++)
		{
			sum+=number[i];
		}
		System.out.println("Total sum of array "+sum);
		
		//Calculate and display average of all numbers in the array
		for(int i=0;i<num;i++)
		{
			sum+=number[i];
			
		}
		System.out.println("Total avg of Array = "+sum/num);
		
		// Find and display Highest and lowest number in the array 
		int highest=number[0];
		int lowest=number[0];
		for(int i=0;i<num;i++)
		{
			if(highest<number[i])
			{
				highest=number[i];
			}
			if(lowest>number[i])
			{
				lowest=number[i];
			}
			
		}
		System.out.println("higest value in Array= "+highest);
		System.out.println("Lowest value in Array= "+lowest);
		
		// Find and display occurance of 5 in the array (find how many times 5 occured in the array)
		int count=0;
		
		for(int i=0;i<num;i++)
		{
			if(number[i]==5)
			{
				count++;
			}
		}
		System.out.println("occurance of 5 in the array "+count);
		
		
		
	}

}
