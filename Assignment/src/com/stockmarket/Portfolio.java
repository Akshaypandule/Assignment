package com.stockmarket;

import com.String.Case;

public class Portfolio {
	
	private double balance;
	private int[]stockquantity;
	
	public Portfolio(double initalbalance)
	{
		balance=initalbalance;
		stockquantity=new int[5];
	}
	public double getBalance() {
		return balance;
	}
	public int getStockquantity(int indexofStock)
	{
		return stockquantity[indexofStock];
	}
	public int getIndex(String stockname)
	{
		switch(stockname)
		{
		case "SBI":
			return 0;
			
		case "ICICI":
			return 1;
		
		case "BHEL":
			return 2;
			
		case "DEMAT":
			return 3;
			
		case "MRF":
			return 4;
			
		default:
			return -1;
		
		}
	}
	public void Buystock(Stock stock,int quantity)
	{
		double totalprice=stock.getStockprice()*quantity;
		if(balance<totalprice) {
			System.err.println("Insufficient fund in your wallet");
			System.exit(1);
		}
		stockquantity[getIndex(stock.getStockname())]+=quantity;
		balance-=totalprice;
		System.out.println("Bought "+quantity+" quantity shares of "+stock.getStockname()+" for "+stock.getStockprice()+" rs each. \nTotal price of "+quantity+" shares is : "+totalprice);
	}
	
	public void sellStock(Stock stock,int quantity) {
		
		int indextodstock=getIndex(stock.getStockname());
		if(quantity>stockquantity[indextodstock])
		{
			System.err.println("Insufficient stock quantity avaliable in your portfolio only "+getStockquantity(indextodstock)+"quatity");
			return;
		}
		stockquantity[indextodstock]-=quantity;
	   double totalearningprice=stock.getStockprice()*quantity;
	   balance+=totalearningprice;
	   System.out.println("sold "+quantity+" shares of "+stock.getStockname()+" for "+stock.getStockprice()+" rs price each. \nTotal earning price of "+quantity+" shares is : "+totalearningprice);
       System.out.println("\nTotal Balance is : "+balance+" rs.\n");
	}

}
