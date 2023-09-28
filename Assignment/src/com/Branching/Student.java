package com.Branching;
import java.util.Scanner;
public class Student {
	
	public static void main(String [] args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter Your Mathematics marks:");
	   float math = sc.nextFloat();
	   System.out.println("Enter Your English marks:");
	   float eng = sc.nextFloat();
	   System.out.println("Enter Your Science marks:");
	   float sci = sc.nextFloat();
	   System.out.println("Enter Your History marks:");
	   float history = sc.nextFloat();
	   System.out.println("Enter Your Sanskrit marks:");
	   float sanskrit = sc.nextFloat();
	   float avg = (math+eng+sci+history+sanskrit)/5;
    if(avg>=75)
	{
	   System.out.println("'First Class with Distinction' you got "+avg+"%");
	}
	else if(avg>60 && avg<75)
	{
	   System.out.println("'First Class' you got "+avg+"%");
	}
	else if(avg>50 && avg<=60)
	{
	   System.out.println("'Second Class' you got "+avg+"%");
	}
	else if(avg>=40 && avg<=50)
	{
	    System.out.println("'Pass' you got "+avg+"%");
	}
	else
	{
	    System.out.println("'Fail' you got "+avg+"%");
	}
  }
}
