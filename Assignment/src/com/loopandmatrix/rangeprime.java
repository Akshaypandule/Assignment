package com.loopandmatrix;

import java.util.Scanner;

public class rangeprime {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start num");
		int start=sc.nextInt();
		System.out.println("Enter the end number");
		int end=sc.nextInt();
		
		for(int i=start;i<end;i++)
		{	
		}
	}
	public static boolean primerange(int start,int end)
	{
		for(int i=start;i<end/2;i++)
		{
			if(i%2==0)
			{
				return false;
			}
		}
		return true;
	}
}
