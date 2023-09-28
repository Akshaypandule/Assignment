package com.stockmarket;

import java.util.Random;

public class Stock {
	
	private String stockname;
	private double stockprice;
	
	public Stock(String stockname,double stockprice)
	{
		this.stockname=stockname;
		this.stockprice=stockprice;
	}
	public String getStockname() {
		return this.stockname;
	}
	public double getStockprice() {
		return this.stockprice;
	}
	public void updateprice(double changePercent)
	{
		double plusmines=Math.random()<new Random().nextDouble(1.500) ? -1 : 1;
		changePercent *= plusmines;
        stockprice += (changePercent*100);

        if(stockprice<0){
            stockprice*=-1;
        }
}

}
