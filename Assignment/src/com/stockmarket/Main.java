package com.stockmarket;

public class Main {
	public static void main(String[] args) {
		
		StockmarketApplication st=new StockmarketApplication();
		Thread t1=new Thread(st);
		t1.start();
	}

}
