package com.Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bankoperations {
	
	private static Map<Integer, BankAccount> accounts=new HashMap<>();
	private static Scanner sc=new Scanner(System.in);
	
	
	public static void initialization() {
		int accountnumber[]= {8877, 9757, 3688, 2584, 1338, 1426, 2329, 5645, 2376, 8980};
		double inibalance[]= {10000,5100,69333,50123,45520.20,566300,46454,69331,85662,65656};
		for(int i=0;i<accountnumber.length;i++) {
			
			accounts.put(accountnumber[i],new BankAccount(accountnumber[i], inibalance[i]));
			
		}
	}
	public void creditbalance() {
		System.out.println("Enter account number");
		int accountN=sc.nextInt();
		BankAccount account=accounts.get(accountN);
		if(account!=null) {
			System.out.println("Enter amount");
			double amount=sc.nextDouble();
			account.credit(amount);
			System.out.println(amount+" Rs added successfully");
		}
		else
		{
			System.out.println("You Enter wrong Account Number");
		}
	}
	public  void debitbalance() throws InsufficientfundException {
		System.out.println("Enter Account Number");
		int accountnumber=sc.nextInt();
		BankAccount account=accounts.get(accountnumber);
		if(account!=null)
		{
			System.out.println("Enter amount for debit");
			double amount=sc.nextDouble();
			account.debit(amount);
		}
		else
		{
			System.out.println("Enter Wrong Account Number......");
		}
	}
	public void transferamount() throws InsufficientfundException {
		System.out.println("Enter FormAccount Number");
		int formaccount=sc.nextInt();
		System.out.println("Enter amount to tranfer");
		double amount=sc.nextDouble();
		System.out.println("Enter toAccount Number");
		int toaccount=sc.nextInt();
		
		BankAccount accountform=accounts.get(formaccount);
		BankAccount accountto=accounts.get(toaccount);
		if(accountform!=null && accountto!=null) {
			accountform.debit(amount);
			accountform.credit(amount);
			System.out.println("Amount transfer successfully.....");
		}
		else
		{
			System.out.println("Invalid account Number.....");
		}
		
	}
	public void displaybalance() {
		System.out.println("Enter the account number...");
		int accountnumber=sc.nextInt();
		BankAccount account_Number=accounts.get(accountnumber);
		if(account_Number!=null) {
			System.out.println("Account Number"+account_Number.getAccountnumber()+"  balance is "+account_Number.getBalance());
		}
		else
		{
			System.out.println("Enter Wrong Account Number");
		}
	}
	public void displayallaccount() {
		for(BankAccount account:accounts.values())
		{
			System.out.println(account.getAccountnumber());
		}
	}

}
