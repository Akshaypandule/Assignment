package com.Bank;

public class BankAccount {
	
	private int accountnumer;
	private double balance;
	
	public BankAccount(int accountnumer,double balance)
	{
		this.accountnumer=accountnumer;
		this.balance=balance;
	}
	public int getAccountnumber() {
		return this.accountnumer;
	}
	public void setAccountnumber(int accountnumer) {
		this.accountnumer=accountnumer;
	}
	public double getBalance() {
		return this.balance;
	}
	public void credit(double amount)
	{
		balance+=amount;
	}
	public void debit(double amount) throws InsufficientfundException {
		if(balance>=amount) {
			balance-=amount;
		}
		else
		{
			throw new InsufficientfundException("Insufficient balance to de");
		}
	}
	

}
