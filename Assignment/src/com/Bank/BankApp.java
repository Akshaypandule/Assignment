package com.Bank;

import java.util.Scanner;

public class BankApp {
	
	public static void main(String[] args) throws InsufficientfundException {
		
		Bankoperations m=new Bankoperations();
		Scanner sc=new Scanner(System.in);
		while(true) {
			Bankoperations.initialization();
			System.out.println("Enter your choice");
			System.out.println("1. Credit amount in your account");
			System.out.println("2. debit amount in your account");
			System.out.println("3. Transfer Balance");
			System.out.println("4. display balance");
			System.out.println("5. display all Accounts");
			System.out.println("6. Exist");
			int choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				m.creditbalance();
				break;
			case 2:
				m.debitbalance();
				break;
			case 3:
				m.transferamount();
				break;
			case 4:	
				m.displaybalance();
				break;
			case 5:
				m.displayallaccount();
				break;
			case 6:
				System.out.println("Exist");
			    System.exit(0);
		}
		
	}

}}
