package com.stockmarket;

import java.util.Random;
import java.util.Scanner;

public class StockmarketApplication implements Runnable {
	
	
	private static final String[] stoklist= {"SBI","ICICI","BHEL","BMAT","MRF"};
	private static final double[]pricelist= {100.0, 105.0, 85.0, 1520.0, 54200.0};
	private static final int maxqty=10;
	private static final double initalbalance=1000000;
	
	private Stock[] stock;
	private Random random;
	private Portfolio portfolio;
	Scanner sc=new Scanner(System.in);
	
	public StockmarketApplication() {
		stock=new Stock[stoklist.length];
		random=new Random();
		portfolio=new Portfolio(initalbalance);
		
		for(int i=0;i<stock.length;i++)
		{
			stock[i]=new Stock(stoklist[i], pricelist[i]);
		}
	}

	@Override
	public void run() {
		
		
		while(true) {
			  System.out.println("Enter your choice");
	            System.out.println("1. View price of stock \n2. Buy Stock  \n3. Sell Stock  \n4. View portfolio  \n5. Exit");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            int indexOfStock = -1;
	            
	            
	            switch (choice) {
	            
	            case 1:
	            	// update stock price
	            	for(Stock stocks:stock) {
	            		double changepercent=random.nextDouble(1.500);
	            		stocks.updateprice(changepercent);
	            	}
	            	// view update stock price
	            	for(Stock stocks:stock) {
	            		System.out.println("Stock name "+stocks.getStockname()+" current price "+stocks.getStockprice());
	            	}
	            	break;
	            	
	            case 2:
	            	// buy stock
	            	System.out.println("Enter stock name");
	            	String stockName=sc.nextLine();
	            	
	            	for(int i=0;i<stoklist.length;i++)
	            	{
	            		if(stoklist[i].equalsIgnoreCase(stockName))
	            		{
	            			indexOfStock =i;
	            		}
	            	}
	            	if(indexOfStock==-1) {
	            		System.err.println("Invalid stock name");
	            	}
	            	 System.out.println("How much qty you want to buy ? (between 1 to 10)");
	                    int qty = sc.nextInt();

	                    if(qty<1 || qty>maxqty){
	                        System.err.println("Invalid quantity... Quantity should be between 1 to 10");
	                        return;
	                    }
	                    Stock stocks = stock[indexOfStock];
	                    portfolio.Buystock(stocks, qty);
	                    break;
	                    
	            case 3 :
                    System.out.println("Enter the name of stock which one you want to sell?");
                    stockName = sc.nextLine().toUpperCase();

                    for(int i = 0; i<stoklist.length; i++) {
                        if (stoklist[i].equals(stockName)) {
                            indexOfStock = i;
                        }
                    }
                        if(indexOfStock == -1){
                            System.err.println("Invalid stock name");
                            return;
                        }

                    System.out.println("\n"+portfolio.getStockquantity(indexOfStock)+" shares available of "+stockName+" in your portfolio");

                    System.out.println("\nHow much quantity you want to sell? (Enter qty between 1 to 10)");
                    qty = sc.nextInt();

                    if(qty<1 || qty> portfolio.getStockquantity(indexOfStock)){
                        System.err.println("Invalid Quantity... You have only "+portfolio.getStockquantity(indexOfStock)+" shares of "+stockName);
                    }

                    Stock stocks2 = stock[indexOfStock];
                    portfolio.sellStock(stocks2, qty);

                    break;
	            case 4 :
                    System.out.println("\nYour Portfolio : ");
                    for(int i = 0; i < stoklist.length; i++){
                        stockName = stoklist[i];
                        double quantity = portfolio.getStockquantity(i);
                        System.out.println("Stock name : "+stockName+"\t qty : "+quantity);

                    }
                    System.out.println("\nTotal Balance is : "+portfolio.getBalance()+" rs\n");

                    break;

                case 5 :
                    System.out.println("Thank you !!! keep trading...");
                    return;


                default:
                    System.err.println("Error... Enter valid option");
				}
	            
	            
				
		}
		
	}
	
	
	
	

}
