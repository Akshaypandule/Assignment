package com.String;

import java.util.Scanner;

public class Email {
	
	public static boolean isvalidemail(String email) {
		
		// Contains only one '@' symbol and it's not in the first position
		int atIndex=email.indexOf("@");
		if (atIndex == -1 || atIndex != 0) {
            return false;
        }
		//Contains one or multiple '.'
		int dotIndex=email.indexOf('.');
		if(dotIndex==-1) {
			return false;
		}
		// '@' and '.' should not be near, and there should be at least one '.' after '@'
		if(dotIndex-atIndex<=1) {
			return false;
		}
		//'.' should not be at the last position
		if(dotIndex==email.length()-1)
		{
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Email");
		String email=sc.next();
		boolean isvalid= isvalidemail(email);
		if(isvalid==true)
		{
			System.out.println("Email is valid");
		}
		else
		{
			System.out.println("Email is Invalid");
		}
	}

}
