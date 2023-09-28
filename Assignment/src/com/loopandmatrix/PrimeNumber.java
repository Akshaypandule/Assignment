package com.loopandmatrix;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number to check its prime or not");
		int n=sc.nextInt();
		boolean isprime=true;
		if(n==0|| n==1)
		{
			isprime=false;
		}
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					isprime=false;
					break;
				}
		}
		
		}
		
		if(isprime==true) {
			System.out.println("number "+n+" is prime number");
		}
		else
		{
			System.out.println("Number is not prime number..");
		}
		
	}

}
