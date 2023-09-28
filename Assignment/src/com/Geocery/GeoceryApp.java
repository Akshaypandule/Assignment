package com.Geocery;
import java.util.Scanner;

public class GeoceryApp {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Methodlogic m=new Methodlogic();
		while(true)
		{
		System.out.println("Enter your choice");
		System.out.println("1 Show all item in shop");
		System.out.println("2 Add item in cart");
		System.out.println("3 show all cart item");
		System.out.println("4  total bill");
		System.out.println("5 Exist");
		int choice=sc.nextInt();
		switch (choice) {
		    case 1:
		    	m.Showitem();
		    	break;
		    case 2:
		    	m.Additemincart();
		    	break;
		    case 3:
		    	m.showcart();
		    	break;
		    case 4:
		    	m.Totalbill();
		    	break;
		    case 5:
		    	System.out.println("Thank for visiting");
		    	System.exit(0);
		  }
	   }
	}

}