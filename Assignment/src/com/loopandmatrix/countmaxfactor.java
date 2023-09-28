package com.loopandmatrix;

import java.util.Scanner;

public class countmaxfactor {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The firstvv number");
		int num1=sc.nextInt();
		System.out.println("Enter the second Number");
		int num2=sc.nextInt();
		int num1count=0;
		int num2count=0;
		
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0)
			{
				num1count++;
			}
		}
		for(int j=1;j<=num2;j++)
		{
			if(num2%j==0)
			{
				num2count++;
			}
		}
		if(num1count>num2count)
		{
			System.out.println(num1+" contain maximum factor");
		}
		else if(num2count>num1count)
		{
			System.out.println(num2+" contain maximum factor");
		}
		else
		{
			System.out.println("Both are equal factor");
		}
	}

}
