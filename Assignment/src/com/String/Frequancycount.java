package com.String;

import java.util.Scanner;

public class Frequancycount {
	
	public static void main(String[] args) {
		
	  Scanner sc=new Scanner(System.in);	
	  System.out.println("Enter the String");
	   String str=sc.next();
	   int i;
	   for( i=0;i<str.length();i++)
	   {
		   int count = 1;
		   for(int j=i+1;j<str.length();j++) {
			   if(str.charAt(i)==str.charAt(j)) {
				   count++;
			   }
			  
		   }  
		   System.out.print(str.charAt(i)+""+count); 
		   
		   
		   i+=count-1;   //Skip the repeated occurrences of same character.
	   }
	}
}
