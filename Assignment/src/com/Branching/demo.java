package com.Branching;

import java.util.Scanner;

public class demo {
	
	
	//Take N numbers from user and calculate follwing:
	// Sum, Avg, Max, Min
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How much numbers you want to calculate?");
		float n = sc.nextInt();
		float sum=0;
		float max=0;
		float min=0;
		for(int i=1; i<=n; i++)
		{	
		      System.out.println("enter "+i+"st number :");
		      float a = sc.nextInt();
		      sum+=a;
		        if(i==1){
		                 max=a;
		                 min=a;
		                 }else
		                 {
							 if(a>max){
							 max=a;
							 }else
								 
							 {
							max=max;
							}
							 if(a<min)
							 {
							 min=a;
		                  }
							 else
		                  {
		                  min=min;
		                 }
		             }
		        
	      }
		System.out.println("Sum is : "+sum);
		System.out.println("Average is : "+(sum/n));
		System.out.println("Maximum number is : "+max);
		System.out.println("Minimum number is : "+min);}
}
